
//out << asCSNode(1841294).feature("location")
//out << asCSNode(1841294).getVersions()



//out << docx.loadWordDoc(asCSNode(1863083)).listExtendedProperties()


/*def actividades = """
DELETE FROM Z_MAR_EventoEquipos
"""*/
/*act = sql.runSQLFast(actividades,true,true,0)*/
//databaseSelect
//return docman.getNode(1565095).exportXml().content
//def xmlArray = new XmlParser().parse(docman.getNode(2556909).exportXml().content)

//out << xmlArray.llnode.node.@extendeddata[0].getMapFromOscript()
//json(new JsonBuilder(xmlArray.llnode.node.@extendeddata[0].getMapFromOscript()))

//return docman.getNode(1842081).lastVersion.content.content

csws.registerRESTClient("script", "https://api.github.com", true, null, null)

def client = csws.getRegisteredRESTClient("script")

def resp = client.put(path:'repos/camivar1397/Test-Techedge/contents/CS_Ejemplo2.java', headers:["Content-Type":"application/json","Authorization":"Bearer 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"],{
        json(message:"Add content Script CS_Ejemplo",content:"${funcionConvertirImagen(1842081)}")
})

out << resp.data

def funcionConvertirImagen(imagenID){
    def file = docman.getNode(imagenID).lastVersion.content.content

    FileInputStream fileInputStreamReader = new FileInputStream(file);
    byte[] bytes = new byte[(int)file.length()];
    fileInputStreamReader.read(bytes);
    String encodedFile = Base64.getEncoder().encodeToString(bytes);
    return encodedFile
}









