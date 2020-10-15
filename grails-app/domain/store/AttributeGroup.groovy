package store

class AttributeGroup {

	String name
	static hasMany = [attributes:Attribute, attributeGroups:AttributeGroup]

    static constraints = {
    }
}
