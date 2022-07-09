import java.util.UUID;

/**
 * @author Dm.Petrov
 * DATE: 09.07.2022
 */
public class Db {
        private DbSetting dbSetting;
        private MyEntity myEntity;

        public Db(DbSetting dbSetting) {
            this.dbSetting = dbSetting;
            myEntity = new MyEntity("first");
            myEntity.setId(UUID.randomUUID());
        }

        public DbSetting getDbSetting() {
            return dbSetting;
        }

        public MyEntity getMyEntity() {
            return myEntity;
        }

        public void setMyEntity(MyEntity myEntity) {
            this.myEntity = myEntity;
        }
    }

