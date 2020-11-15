# Geo Rest
Geospatial Rest API Demo project for Spring Boot 
(inspired by https://github.com/ZXVentures/ze-code-challenges)
	
## Endpoint: create partner

	`{URL}/api/partner/create}`
	
	JSON request example:
	
	`{
	  "id": "", 
	  "tradingName": "Distribuidor Parceiro XPTO",
	  "ownerName": "João Teste",
	  "document": "1234567891234/0001",
	  "coverageArea": { 
	    "type": "MultiPolygon", 
	    "coordinates": [
	      [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
	      [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
	    ]
	  },
	  "address": { 
	    "type": "Point",
	    "coordinates": [-46.57421, -21.785741]
	  }
	}`
	
	JSON response example:
	
	`{
	  "id": 123, 
	  "tradingName": "Distribuidor Parceiro XPTO",
	  "ownerName": "João Teste",
	  "document": "1234567891234/0001",
	  "coverageArea": { 
	    "type": "MultiPolygon", 
	    "coordinates": [
	      [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
	      [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
	    ]
	  },
	  "address": { 
	    "type": "Point",
	    "coordinates": [-46.57421, -21.785741]
	  }
	}`

## Endpoint: get partner

	`{URL}/api/partner/{id}`	
	
## Endpoint: search nearest partner

	`{URL}/api/partner/search`	
	
	JSON request example:
	
	`{
    	"address": { 
	    	"type": "Point",
	    	"coordinates": [-46.57421, -21.785741]
	  }
	}`
	
	JSON response example:
	
	`{
	  "id": 124, 
	  "tradingName": "Distribuidor Parceiro XYZ",
	  "ownerName": "Testando Silva",
	  "document": "1234567891234/0001",
	  "coverageArea": { 
	    "type": "MultiPolygon", 
	    "coordinates": [
	      [[[30, 20], [45, 40], [10, 40], [30, 20]]], 
	      [[[15, 5], [40, 10], [10, 20], [5, 10], [15, 5]]]
	    ]
	  },
	  "address": { 
	    "type": "Point",
	    "coordinates": [-46.57421, -21.785741]
	  }
	}`

## Build
```bash
mvn clean package
```

## Run
```bash
mvn spring-boot:run
```
