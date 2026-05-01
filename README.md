# Exercice 4 : Gestionnaire de banque

## Objectif
Ce projet est une application Java qui permet de gérer différents types de comptes bancaires.
Il illustre le principe d'**héritage** en POO en créant une classe parente `BankAccount` dont héritent trois classes enfants : `CheckingAccount`, `SavingsAccount` et `COD`.

---

## Structure du projet

- `BankAccount.java` : classe parente représentant un compte bancaire générique avec les attributs account et balance.
- `CheckingAccount.java` : classe enfant représentant un compte courant, avec un attribut supplémentaire limit.
- `SavingsAccount.java` : classe enfant représentant un compte d'épargne, avec un attribut supplémentaire interestRate.
- `COD.java` : classe enfant représentant un certificat de dépôt, avec un attribut supplémentaire durationMonths.
- `Main.java` : classe principale qui crée une instance de chaque type de compte et affiche leurs informations.

---

## Prérequis

- Java JDK 21
- IntelliJ IDEA (ou tout autre IDE compatible)
- Git installé sur votre machine

---

## Installation et exécution

- Clonez le dépôt :
```bash
git clone https://github.com/cmoussa07/BankManager.git
```
- Ouvrez le projet dans IntelliJ IDEA.
- Vérifiez que le JDK est bien configuré sur la version 21.
- Lancez la classe `Main`.

---

## Fonctionnement

- Le programme crée une instance de chaque classe enfant (`CheckingAccount`, `SavingsAccount`, `COD`).
- Chaque instance hérite automatiquement des attributs `account` et `balance` de la classe parente `BankAccount`.
- Les attributs sont définis et lus directement depuis la méthode main.
- Les informations de chaque compte sont affichées en FCFA dans la console.


## Concepts illustrés

- **Héritage** (`extends`) : les classes enfants récupèrent automatiquement les attributs de `BankAccount`.
- **Classe parente / Classe enfant** : `BankAccount` est la classe parente, `CheckingAccount`, `SavingsAccount` et `COD` sont les classes enfants.
