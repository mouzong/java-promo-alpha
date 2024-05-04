1. **Fonctions et Interfaces Fonctionnelles** :
    - Créez une interface fonctionnelle `MathOperation` avec une méthode `int operate(int a, int b)`.
    - Implémentez des classes concrètes pour réaliser des opérations telles que l'addition, la soustraction, la multiplication, et la division.
    - Utilisez des instances de ces classes pour effectuer des opérations mathématiques.

2. **Chaining Functions** :
    - Créez une fonction qui prend un entier en entrée et renvoie son carré.
    - Créez une autre fonction qui prend un entier en entrée et renvoie le résultat de l'ajout de 2 à cet entier.
    - Utilisez la méthode `andThen` pour combiner ces deux fonctions et appliquez le résultat à un nombre donné.

3. **Streams** :
    - Créez une liste de nombres entiers.
    - Utilisez un stream pour filtrer les nombres pairs.
    - Ensuite, utilisez une méthode de transformation pour doubler chaque nombre.
    - Enfin, utilisez une méthode de réduction pour obtenir la somme de ces nombres.

4. **Optionals** :
    - Écrivez une méthode qui prend en entrée une chaîne de caractères et retourne sa longueur.
    - Gérez le cas où la chaîne de caractères pourrait être nulle en renvoyant un Optional contenant la longueur si la chaîne n'est pas nulle, ou un Optional vide si la chaîne est nulle.
    - Utilisez cette méthode pour afficher la longueur d'une chaîne saisie par l'utilisateur.

5. **Expressions Lambda** :
    - Écrivez une méthode qui prend en entrée une liste de chaînes de caractères et un prédicat.
    - La méthode doit filtrer la liste de chaînes en utilisant le prédicat et retourner la liste filtrée.
    - Utilisez une expression lambda pour implémenter le prédicat qui filtre les chaînes de caractères dont la longueur est supérieure à 5.

6. **BiFunctions** :
    - Créez une interface fonctionnelle `StringConcatenator` avec une méthode `String concatenate(String str1, String str2)`.
    - Implémentez une classe concrète qui concatène deux chaînes de caractères avec un espace entre elles.
    - Utilisez une instance de cette classe pour concaténer deux chaînes de caractères données.

7. **Consumers et BiConsumers** :
    - Écrivez une méthode qui prend en entrée une liste de chaînes de caractères et un Consumer.
    - La méthode doit appliquer le Consumer à chaque élément de la liste.
    - Ensuite, écrivez une méthode similaire qui prend en entrée une liste de paires de chaînes de caractères et un BiConsumer.
    - La méthode doit appliquer le BiConsumer à chaque paire de chaînes de caractères de la liste.

8. **Predicates** :
    - Écrivez une méthode qui prend en entrée une liste de nombres entiers et un Predicate.
    - La méthode doit filtrer la liste pour ne garder que les nombres qui satisfont le prédicat.
    - Utilisez une expression lambda pour implémenter le prédicat qui filtre les nombres inférieurs à 10.

9. **Suppliers** :
    - Créez une méthode qui génère un nombre entier aléatoire entre 1 et 100 et le retourne.
    - Utilisez un Supplier pour représenter cette méthode.
    - Appelez la méthode plusieurs fois pour obtenir différents nombres aléatoires.

10. **Combinaison de Concepts** :
    - Créez une liste de chaînes de caractères contenant à la fois des mots en minuscules et des mots en majuscules.
    - Utilisez un stream pour filtrer les chaînes de caractères en minuscules.
    - Ensuite, utilisez une fonction pour transformer chaque chaîne de caractères filtrée en majuscules.
    - Enfin, utilisez un Consumer pour afficher chaque chaîne de caractères transformée.
