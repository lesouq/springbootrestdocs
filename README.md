# springbootrestdocs
# Table des matières
  - Avantage de Spring Rest Docs
  
  - Dépendances Maven
    -création controller REST
    
  - Configuration des documents Spring Rest
    - Cas de test unitaire
    - Génération de la documentation
    - Conversion d'AsciiDoc
    - Rejoindre les extraits générés
    - Ajouter des informations supplémentaires
    
  - Conclusion
  
# Avantage de Spring Rest Docs
  
Il prend le travail de docuùentation aux différents endroits évitant ainsi la nécessité d'ajouter des informations de documentation dans le controller ou d'autres endroits. 
Spring utilise le test pour produire la documentation des services REST, cette approche permet de générer la documentation qui est assez proche du comportement de l'API.
On utilise l'Asciidoctor pour produire la documentation.

Voici quelques avantages:

  - Prend en charge Hypermedia
  - Il est toujours gégéner sur la base des tests (documentation précise et mise à jour). Lorsque l'on met à jour les critères de test, la documentation sur l'API REST sera 
  mise à jour automatiquement.
  - Prend en charge les formats XML et JSON
  - Pas besoin d'ajouter des annotations et des description aux méthodes du controller
  
# Dépendances Mavan

Pour la prise en charge de Spring Rest Docs, il faut ajouter dans les dépendances "spring-restdocs-mockmvc"

   (<dependency>
      <groupId>org.springframework.restdocs</groupId>
      <artifactId>spring-restdocs-mockmvc</artifactId>
      <scope>test</scope>
   </dependency>)
   
   # Création controller REST
Le controller REST un un controller avec deux méthodes:
  - retourne le produit en fonction du code produit
  - retourne tous les produits disponibles
  
# Configuation des documents Spring REST
  # Cas de test unitaire
  
  Il nous faut créer une class ProductControllerTest sous src/test/java dans le package de l'application. Cela nous permettra de constater si il renvoie la valeur attendue à
  l'API client.
  
  # Génération de la documentation
  
  Vue que l'on travaille sur l'API REST, nous sommes déjà sur du contenu dynamique , donc nos documents Spring REST l'utiliseront pour la documentation. Nous aurons besoin de
  modifier quelques éléments dans ProductControllerTest:
  
  @AutoConfigureRestDocs(outputDir = "target/snippets")
  
  .andExpect(MockMvcResultMatchers.content().string(containsString("WD SSD"))).andDo(document("product/get-product-by-id"));
  
 Le "@AutoConfigureRestDocs" prend comme argument un emplacement de répertoire pour les extraits générés.
 le "MockMvcRestDocumentation.document" est l'emplacement de la documentation.
