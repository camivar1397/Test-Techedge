def options = admin.newImportOptions
options.setInheritPermissions(0)
options.setOwner(true)
options.setOwnerID(1000)
options.setCreator(true)
options.setCreatorID(1000)
options.setExtUserInfo(true)
def csvol = docman.getNodeByName(self.parent, "3043.xml").content
admin.importXml(self.parent, options, csvol.content)


