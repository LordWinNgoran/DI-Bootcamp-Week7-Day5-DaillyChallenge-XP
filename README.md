# DI-Bootcamp-Week7-Day5-DaillyChallenge-XP
---
### Daily Challenge : Password Generator
Instructions
> Usually, we need to generate a secure password for security purposes.

> There are several ways to generate a strong password in Java.

> In this exercise, you will understand how we can generate a strong password having at least two lowercase characters, two uppercase characters, 
> two digits, and two special characters.

There are the following ways to generate a password in Java:
>1. Using Passay Library
Passay is one of the most used password policy enforcement libraries.

You will use the library to generate a password using a configurable ruleset.

You can create the necessary rules for passwords by using the default CharacterData implementation.

You can also create your custom CharacterData implementation as per your needs.

In order to use Passay library we need to add the following dependency in the POM.xml file:
`<dependency>
        <groupId>org.passay</groupId>
        <artifactId>passay</artifactId>
        <version>1.3.1</version>
</dependency>`

>2. Using `RandomStringGenerator`
It is another way to generate a secure password, i.e., by using `RandomStringGenerator` in Apache Commons Text.

`RandomStringGenerator` generates Unicode string having a specified number of code points.

You will use `RandomStringGenerator` by creating an instance of the generator by using the Builder class of the `RandomStringGenerator`.

You can also modify the properties of the generator.

There is one drawback of using this method, i.e., you cannot specify the number of characters in each set like Passay.

However, you can overcome this drawback by combining the result of multiple sets.
