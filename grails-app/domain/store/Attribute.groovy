package store

class Attribute {

	String name
	static hasMany = [attributeValues:AttributeValue]

    static constraints = {
    }
}
