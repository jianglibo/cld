/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.InnodbCmpRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class InnodbCmp extends TableImpl<InnodbCmpRecord> {

	private static final long serialVersionUID = 1961874314;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMP</code>
	 */
	public static final InnodbCmp INNODB_CMP = new InnodbCmp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbCmpRecord> getRecordType() {
		return InnodbCmpRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMP.page_size</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP.compress_ops</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS = createField("compress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS_OK = createField("compress_ops_ok", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP.compress_time</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> COMPRESS_TIME = createField("compress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP.uncompress_ops</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_OPS = createField("uncompress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP.uncompress_time</code>.
	 */
	public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_TIME = createField("uncompress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMP</code> table reference
	 */
	public InnodbCmp() {
		this("INNODB_CMP", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMP</code> table reference
	 */
	public InnodbCmp(String alias) {
		this(alias, INNODB_CMP);
	}

	private InnodbCmp(String alias, Table<InnodbCmpRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmp(String alias, Table<InnodbCmpRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmp as(String alias) {
		return new InnodbCmp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbCmp rename(String name) {
		return new InnodbCmp(name, null);
	}
}
