# Queries Splunk das APIs Cat&Foto 
Esse documento apresenta como foi extraido os relatórios de monitoramento no Splunk.

# Queries API
Após configuração de monitoramento da Api foi criado uma chave de source para acompanhamento do monitoramento.


### API Listar Todos os Gatos

```shell
index="main" source="rest://listartodosgatos"
```

### API Listar Gatos por Raça

```shell
index="main" source="rest://listargatosporraca"
```

### API Listar Gatos por Origem

```shell
index="main" source="rest://listagatospororigem" 
```

### API Listar Gatos por Temperamento

```shell
index="main" source="rest://listagatosportemperamento" 
```

### API Listar Todos as Fotos

```shell
index="main" source="rest://listatodasfotos" 
```

### API Listar Fotos por Categoria

```shell
index="main" source="rest://listafotosporcategoria" 
```

### API Listar Fotos por Raca

```shell
index="main" source="rest://listafotosporraca" 
```