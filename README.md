
## Diagrama de Classes
```mermaid
classDiagram
    Usuario : -String nome
    Usuario : -int cpf
    Usuario : -Contato contato
    Usuario : -TipoUsuario tipoUsuario
    Usuario : -List~Ofertas~ oferta
    Usuario : -List~Demanda~ demandas
    Usuario *-- Oferta
    Usuario *-- Demanda
    Usuario *-- Contato
    Usuario *-- TipoUsuario
    Oferta : -String commoditie
    Oferta : -int preço
    Oferta : -String descrição
    Oferta : -String local
    Demanda : -String commoditie
    Demanda : -int preço
    Demanda : -String descrição
    Demanda : -String local
    Contato : -String email
    Contato : -int telefone
    TipoUsuario : -String tipoUsuario
    TipoUsuario : -String empresa
    
```
