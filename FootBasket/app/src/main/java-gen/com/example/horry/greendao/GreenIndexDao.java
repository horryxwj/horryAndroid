package com.example.horry.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.horry.greendao.GreenIndex;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GREEN_INDEX".
*/
public class GreenIndexDao extends AbstractDao<GreenIndex, Long> {

    public static final String TABLENAME = "GREEN_INDEX";

    /**
     * Properties of entity GreenIndex.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Indexentity = new Property(1, String.class, "indexentity", false, "INDEXENTITY");
        public final static Property Typevalue = new Property(2, String.class, "typevalue", false, "TYPEVALUE");
    };


    public GreenIndexDao(DaoConfig config) {
        super(config);
    }
    
    public GreenIndexDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GREEN_INDEX\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"INDEXENTITY\" TEXT," + // 1: indexentity
                "\"TYPEVALUE\" TEXT);"); // 2: typevalue
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GREEN_INDEX\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GreenIndex entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String indexentity = entity.getIndexentity();
        if (indexentity != null) {
            stmt.bindString(2, indexentity);
        }
 
        String typevalue = entity.getTypevalue();
        if (typevalue != null) {
            stmt.bindString(3, typevalue);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GreenIndex readEntity(Cursor cursor, int offset) {
        GreenIndex entity = new GreenIndex( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // indexentity
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // typevalue
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GreenIndex entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIndexentity(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTypevalue(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GreenIndex entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GreenIndex entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}