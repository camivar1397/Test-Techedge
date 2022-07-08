def query = """
SELECT 0 AS toggle, ZCA.Seq AS idCodigo, Codigo AS codigo, Nombre AS nombre, Nivel as nivel,
ZCAH.IDCodigoPadre AS idCodigoPadre
FROM Z_GPM_CodigoAplicacion ZCA
INNER JOIN Z_GPM_CodigoAplicacionHijos ZCAH
ON  ZCA.Seq = ZCAH.IDCodigo
WHERE ZCAH.IDCodigoPadre = ${params.IDCodigo}
AND ZCA.Eliminado = 0
            """

def resp = sql.runSQL(query, false, false, 1)

json(new JsonBuilder(resp))