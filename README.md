# Digital-Envelope



A **digital envelope** is a technique used for secure data transmission that combines symmetric key encryption and public key encryption. In this method, a message is first encrypted using a symmetric key, which is then encrypted using the recipient's public key. The resulting digital envelope includes the encrypted message as well as the encrypted symmetric key.

The process of creating a digital envelope involves the following steps:

1. Generate a symmetric key.
2. Encrypt the message using the symmetric key.
3. Generate a public/private key pair for the recipient.
4. Encrypt the symmetric key using the recipient's public key.
5. Send the digital envelope, which includes the encrypted message and the encrypted symmetric key.

To decrypt the message, the recipient must first decrypt the symmetric key using their private key. They can then use the decrypted symmetric key to decrypt the message. The digital envelope technique provides a secure way to transmit data over an insecure channel. The use of symmetric key encryption provides fast and efficient encryption of the message, while the use of public key encryption allows for secure transmission of the symmetric key.

## Pseudocode

```plaintext
1. Read input values for message M and key K
2. Encrypt message M using symmetric key algorithm XOR and store the result in CT1
3. Read input values for integers a and b
4. Calculate the value of M1 as (a * b) - P, where P = 7
5. Calculate values of E and D as E = M1 + a and D = M1 + b
6. Calculate the value of N as N = ((E * D) - P) / M1
7. Calculate the inverse of P modulo N and store it in Q using the function modInverse(A, M)
8. Calculate CT2 as (K * E) modulo N
9. Decrypt CT2 using private key D, inverse Q of P modulo N, and modulo N operation and store the result in AD
10. Decrypt CT1 using AD and store the result in SD
11. Compare the value of SD with the original message M and print "Success - Decrypted value and actual message are the same!" if they are equal, else print "Decrypted value and actual message do not match!!"
12. End the program.
```
      
# Output:
    
![DE](https://user-images.githubusercontent.com/86454425/220006761-e421e948-da6a-4e80-a59f-66c35940d86e.png)
