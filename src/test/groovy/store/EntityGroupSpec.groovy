package store

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EntityGroupSpec extends Specification implements DomainUnitTest<EntityGroup> {

    def setup() {

	new EntityGroup(entityGroupName:"Hey").save(flush: true)
    }

    def cleanup() {
    }

    void "test something"() {
        expect:            
	EntityGroup.count() == 1
    }
}
