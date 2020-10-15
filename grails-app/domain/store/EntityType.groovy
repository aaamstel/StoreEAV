package store

class EntityType {
	
	String name
	static hasMany = [entityGroups:EntityGroup, entities:Entity, attributes:Attribute]

    static constraints = {
    }
}
