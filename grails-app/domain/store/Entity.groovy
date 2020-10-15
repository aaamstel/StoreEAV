package store

class Entity {

	String entityName
	static hasMany = [attributeValues:AttributeValue]	

    static constraints = {
    }
}
