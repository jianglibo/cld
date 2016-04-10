/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.InnodbTempTableInfoRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTempTableInfo extends TableImpl<InnodbTempTableInfoRecord> {

	private static final long serialVersionUID = -1953227083;

	/**
	 * The reference instance of <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
	 */
	public static final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = new InnodbTempTableInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbTempTableInfoRecord> getRecordType() {
		return InnodbTempTableInfoRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(202), this, "");

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, UInteger> N_COLS = createField("N_COLS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, UInteger> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.PER_TABLE_TABLESPACE</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, String> PER_TABLE_TABLESPACE = createField("PER_TABLE_TABLESPACE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.IS_COMPRESSED</code>.
	 */
	public final TableField<InnodbTempTableInfoRecord, String> IS_COMPRESSED = createField("IS_COMPRESSED", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * Create a <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table reference
	 */
	public InnodbTempTableInfo() {
		this("INNODB_TEMP_TABLE_INFO", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table reference
	 */
	public InnodbTempTableInfo(String alias) {
		this(alias, INNODB_TEMP_TABLE_INFO);
	}

	private InnodbTempTableInfo(String alias, Table<InnodbTempTableInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbTempTableInfo(String alias, Table<InnodbTempTableInfoRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbTempTableInfo as(String alias) {
		return new InnodbTempTableInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbTempTableInfo rename(String name) {
		return new InnodbTempTableInfo(name, null);
	}
}
