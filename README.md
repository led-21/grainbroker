
## Diagrama de Classes
```mermaid
classDiagram
    Usuario : +Nome
    Usuario : +CPF
    Usuario : +Email
    Usuario : +Telefone
    Usuario : +Tipo
    Usuario : +Empresa
    Usuario : +Ofertas
    Usuario : +Demandas
    Usuario "1" -- "*" Oferta : tem
    Usuario "1" -- "*" Demanda : tem
    Oferta : +Commoditie
    Oferta : +Preço
    Oferta : +Descrição
    Oferta : +Local
    Demanda : +Commoditie
    Demanda : +Preço
    Demanda : +Descrição
    Demanda : +Local
```
