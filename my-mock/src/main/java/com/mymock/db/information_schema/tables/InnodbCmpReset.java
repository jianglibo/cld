/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.InnodbCmpResetRecord;

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
public class InnodbCmpReset extends TableImpl<InnodbCmpResetRecord> {

	private static final long serialVersionUID = 895297595;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMP_RESET</code>
	 */
	public static final InnodbCmpReset INNODB_CMP_RESET = new InnodbCmpReset();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbCmpResetRecord> getRecordType() {
		return InnodbCmpResetRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.page_size</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_ops</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_OPS = createField("compress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_ops_ok</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_OPS_OK = createField("compress_ops_ok", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_time</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_TIME = createField("compress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.uncompress_ops</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> UNCOMPRESS_OPS = createField("uncompress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.uncompress_time</code>.
	 */
	public final TableField<InnodbCmpResetRecord, Integer> UNCOMPRESS_TIME = createField("uncompress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMP_RESET</code> table reference
	 */
	public InnodbCmpReset() {
		this("INNODB_CMP_RESET", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table reference
	 */
	public InnodbCmpReset(String alias) {
		this(alias, INNODB_CMP_RESET);
	}

	private InnodbCmpReset(String alias, Table<InnodbCmpResetRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmpReset(String alias, Table<InnodbCmpResetRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpReset as(String alias) {
		return new InnodbCmpReset(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbCmpReset rename(String name) {
		return new InnodbCmpReset(name, null);
	}
}
