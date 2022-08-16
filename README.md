# abn_ambro_recipe_manager_application
------------------------------------------------------------------------------------------

You can view the api documentation in swagger-ui by pointing to
http://localhost:9090/swagger-ui.html

## Asked

Create a standalone java application which allows users to manage their favourite recipes. It should
allow adding, updating, removing and fetching recipes. Additionally users should be able to filter
available recipes based on one or more of the following criteria:
1. Whether or not the dish is vegetarian
2. The number of servings
3. Specific ingredients (either include or exclude)
4. Text search within the instructions.

## Provided

abn_ambro_recipe_manager_application helps us manage a Recipe 

1. User can perform all the CRUD operation on it.

2. User can fetch recipes by using different criteria
 
   some of them are:----
    
     * List all the Recipes which is vegiterian.
     * List all the Recipes which serves more than someNumber;

3. User have to follow some rules for fetching criteria queries
   Every Query should starts from fields keyword and follwed by criteria and splited by ,
   
example:---

   http://localhost:9090/abn-api/recipeManagement/v4/recipe?fields=vegetarian:true <br />
   http://localhost:9090/abn-api/recipeManagement/v4/recipe?fields=servings:2 <br />
   http://localhost:9090/abn-api/recipeManagement/v4/recipe?fields=servings:2,name:plumcake <br />
   http://localhost:9090/abn-api/recipeManagement/v4/recipe?fields=servings>2,vegetarian:false <br />
   
4. Integration Testcases have done  by using MockMvc Server.

 
## Technologies

1. Programming Language Java
2. Framework SpringBoot,JPA
3. DB H2
4. Build Tool maven
5. API First approach Swagger defintion then codeGeneration by openapi-generator

## Exposed Routes 

POST API   : http://localhost:9090/abn-api/recipeManagement/v4/recipe  <br />
GETALL API : http://localhost:9090/abn-api/recipeManagement/v4/recipe  <br />

GETBYID    : http://localhost:9090/abn-api/recipeManagement/v4/recipe/1 <br />
UPDATEBYID : http://localhost:9090/abn-api/recipeManagement/v4/recipe/2 <br />
DELETEBYID : http://localhost:9090/abn-api/recipeManagement/v4/recipe/3 <br />


## FYI 
 Please refer api documentation http://localhost:9090/swagger-ui.html
 for payload and response structure for all the HTTP verbs  