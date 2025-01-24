# PaisesVisaAPI
 Insertas un pais y un destino y te devuelve si tienes que sacar visa o no


TUTORIAL MEGAPRO XXGAMERXX

1.Ejecutas la app desde el "PaisesApiApplication
 ![{AC460D61-FC9A-4310-9B43-9F78D35FDEB4}](https://github.com/user-attachments/assets/5d72844c-e7c8-4fdb-af69-43e1fe642614)

2. Te vas a postman, lo pones en modo "POST" - luego te vas a "BODY" seleccionas la opcion "RAW" y te fijas que este en JSON, como se ve en la captura.
![{ECAC17D6-F051-4688-9F57-954242080EA7}](https://github.com/user-attachments/assets/4198cfda-2980-4cd0-ba0d-1d231cd5daa5)
 

3. Ahora escribes un JSON siguiendo este formato:

{
  "paisOrigen": "Chile",
  "paisDestino": "Ecuador"
}

4. Para hacer consultas simplemente tienes que ir cambiando el pais origen y el de destino y automaticamente te va a devolver si requiere visa o no.
![{CB1641FC-09DF-429E-9604-58FD2AF6836C}](https://github.com/user-attachments/assets/edff5c5c-9d04-452d-a905-84d48b36805b)


Y Listo las consultas solo son entre paises de latinoamerica si pones un pais externo no te va  devolver nada
