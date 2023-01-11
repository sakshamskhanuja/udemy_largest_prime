## Largest Prime

### Description

Write a method named <b>getLargestPrime</b> with one parameter of type <b>int</b> named <b>number</b>. If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value. The method should calculate the largest prime factor of a given number and return it.

### Examples of input/output

<ul>
<li>getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)</li>
<li>getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)</li>
<li>getLargestPrime (0); should return -1 since 0 does not have any prime numbers</li>
<li>getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)</li>
<li>getLargestPrime (-1); should return -1 since the parameter is negative</li>
</ul>
