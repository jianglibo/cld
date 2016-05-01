/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.SchemaAutoIncrementColumnsRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaAutoIncrementColumns extends TableImpl<SchemaAutoIncrementColumnsRecord> {

	private static final long serialVersionUID = -583968106;

	/**
	 * The reference instance of <code>sys.schema_auto_increment_columns</code>
	 */
	public static final SchemaAutoIncrementColumns SCHEMA_AUTO_INCREMENT_COLUMNS = new SchemaAutoIncrementColumns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SchemaAutoIncrementColumnsRecord> getRecordType() {
		return SchemaAutoIncrementColumnsRecord.class;
	}

	/**
	 * The column <code>sys.schema_auto_increment_columns.table_schema</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.table_name</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.column_name</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.data_type</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.column_type</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, String> COLUMN_TYPE = createField("column_type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.is_signed</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_SIGNED = createField("is_signed", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.is_unsigned</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, Integer> IS_UNSIGNED = createField("is_unsigned", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.max_value</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, ULong> MAX_VALUE = createField("max_value", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.auto_increment</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, ULong> AUTO_INCREMENT = createField("auto_increment", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
	 */
	public final TableField<SchemaAutoIncrementColumnsRecord, BigDecimal> AUTO_INCREMENT_RATIO = createField("auto_increment_ratio", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 4), this, "");

	/**
	 * Create a <code>sys.schema_auto_increment_columns</code> table reference
	 */
	public SchemaAutoIncrementColumns() {
		this("schema_auto_increment_columns", null);
	}

	/**
	 * Create an aliased <code>sys.schema_auto_increment_columns</code> table reference
	 */
	public SchemaAutoIncrementColumns(String alias) {
		this(alias, SCHEMA_AUTO_INCREMENT_COLUMNS);
	}

	private SchemaAutoIncrementColumns(String alias, Table<SchemaAutoIncrementColumnsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SchemaAutoIncrementColumns(String alias, Table<SchemaAutoIncrementColumnsRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumns as(String alias) {
		return new SchemaAutoIncrementColumns(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SchemaAutoIncrementColumns rename(String name) {
		return new SchemaAutoIncrementColumns(name, null);
	}
}
