package store

class EntityGroup {
	
	String name
	static hasMany = [entityTypes:EntityType, entityGroups:EntityGroup]
	
    static constraints = {
    }
}
