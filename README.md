
## Diagrama de Classes
```mermaid
classDiagram
    Usuario : +Nome
    Usuario : +CPF
    Usuario : +Email
    Usuario : +Telefone
    Usuario : +Tipo
    Usuario : +Empresa
    Usuario : +List~Oferta~ Ofertas
    Usuario : +List~Demanda~ Demandas
    Oferta : +Commoditie
    Oferta : +Preço
    Oferta : +Descrição
    Oferta : +Local
    Demanda : +Commoditie
    Demanda : +Preço
    Demanda : +Descrição
    Demanda : +Local
```
