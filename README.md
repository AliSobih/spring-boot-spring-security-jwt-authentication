# spring-boot-spring-security-jwt-authentication
This project verifies the user by using the jwt token by creating the token and placing it in the response header.
When a new request comes, we verify the existence of this token, then verify the information in it and verify the expiration.

- **Description:** Manages application information.
- **Actions:**
  - POST `/api/auth/register` - Add a new user details.
    - ![Screenshot 2024-01-24 095042](https://github.com/AliSobih/spring-boot-spring-security-jwt-authentication/assets/43109825/c1132bae-d793-4034-b591-31874d17417b)

  - POST `/api/auth/authentication` - sign in.
    - if the password or email is wrong then 403 forbidden response will return.
      
      - ![Screenshot 2024-01-24 095140](https://github.com/AliSobih/spring-boot-spring-security-jwt-authentication/assets/43109825/83707a5f-28eb-47a1-9bcb-9b850f3d60a3)
    - if the email and password correct 200 ok will return and token.
      
      - ![Screenshot 2024-01-24 095155](https://github.com/AliSobih/spring-boot-spring-security-jwt-authentication/assets/43109825/3647ca46-739c-48de-8933-ad90763e3182)
        
  - GET `/api/demo` - get information by after authentication.
    -  getting  information without token then 403 forbidden response will return.
      
      - ![Screenshot 2024-01-24 095341](https://github.com/AliSobih/spring-boot-spring-security-jwt-authentication/assets/43109825/5325d9c8-20f7-4341-8730-bce18bb7bda0)
   
    - getting information with token 200 ok will return.
   
    - ![Screenshot 2024-01-24 095355](https://github.com/AliSobih/spring-boot-spring-security-jwt-authentication/assets/43109825/7e6f7637-cca9-4509-a6c0-e3ecd1ca73ad)
