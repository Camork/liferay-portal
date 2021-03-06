/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.asset.kernel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for AssetCategory. This utility wraps
 * <code>com.liferay.portlet.asset.service.impl.AssetCategoryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryService
 * @generated
 */
@ProviderType
public class AssetCategoryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.portlet.asset.service.impl.AssetCategoryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.asset.kernel.model.AssetCategory addCategory(
			long groupId, long parentCategoryId,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			long vocabularyId, String[] categoryProperties,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCategory(
			groupId, parentCategoryId, titleMap, descriptionMap, vocabularyId,
			categoryProperties, serviceContext);
	}

	public static com.liferay.asset.kernel.model.AssetCategory addCategory(
			long groupId, String title, long vocabularyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCategory(
			groupId, title, vocabularyId, serviceContext);
	}

	public static void deleteCategories(long[] categoryIds)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteCategories(categoryIds);
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), Replaced by {@link
	 #deleteCategories(long[])}
	 */
	@Deprecated
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			deleteCategories(
				long[] categoryIds,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCategories(categoryIds, serviceContext);
	}

	public static void deleteCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteCategory(categoryId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory fetchCategory(
			long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().fetchCategory(categoryId);
	}

	/**
	 * Returns a range of assetCategories related to an AssetEntry with the
	 * given "classNameId-classPK".
	 *
	 * @param classNameId the className of the asset
	 * @param classPK the classPK of the asset
	 * @param start the lower bound of the range of results
	 * @param end the upper bound of the range of results (not inclusive)
	 * @return the matching assetCategories
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getCategories(long classNameId, long classPK, int start, int end) {

		return getService().getCategories(classNameId, classPK, start, end);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getCategories(String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategories(className, classPK);
	}

	/**
	 * Returns the number of assetCategories related to an AssetEntry with the
	 * given "classNameId-classPK".
	 *
	 * @param classNameId the className of the asset
	 * @param classPK the classPK of the asset
	 * @return the number of matching assetCategories
	 */
	public static int getCategoriesCount(long classNameId, long classPK) {
		return getService().getCategoriesCount(classNameId, classPK);
	}

	public static com.liferay.asset.kernel.model.AssetCategory getCategory(
			long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategory(categoryId);
	}

	public static String getCategoryPath(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCategoryPath(categoryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getChildCategories(long parentCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getChildCategories(parentCategoryId);
	}

	/**
	 * eturns a range of child assetCategories.
	 *
	 * @param parentCategoryId the parent category ID
	 * @param start the lower bound of the range of results
	 * @param end the upper bound of the range of results (not inclusive)
	 * @param obc the comparator
	 * @return the matching categories
	 * @throws PortalException
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getChildCategories(
				long parentCategoryId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.asset.kernel.model.AssetCategory> obc)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getChildCategories(
			parentCategoryId, start, end, obc);
	}

	/**
	 * Returns the number of child categories
	 *
	 * @param parentCategoryId the parent category ID
	 * @return the number of child categories
	 * @throws PortalException
	 */
	public static int getChildCategoriesCount(long parentCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getChildCategoriesCount(parentCategoryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getVocabularyCategories(
				long vocabularyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.asset.kernel.model.AssetCategory> obc)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVocabularyCategories(
			vocabularyId, start, end, obc);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
			getVocabularyCategories(
				long parentCategoryId, long vocabularyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.asset.kernel.model.AssetCategory> obc)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVocabularyCategories(
			parentCategoryId, vocabularyId, start, end, obc);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyCategories(
			long groupId, long parentCategoryId, long vocabularyId, int start,
			int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory> obc) {

		return getService().getVocabularyCategories(
			groupId, parentCategoryId, vocabularyId, start, end, obc);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyCategories(
			long groupId, String name, long vocabularyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory> obc) {

		return getService().getVocabularyCategories(
			groupId, name, vocabularyId, start, end, obc);
	}

	public static int getVocabularyCategoriesCount(
		long groupId, long vocabularyId) {

		return getService().getVocabularyCategoriesCount(groupId, vocabularyId);
	}

	public static int getVocabularyCategoriesCount(
		long groupId, long parentCategory, long vocabularyId) {

		return getService().getVocabularyCategoriesCount(
			groupId, parentCategory, vocabularyId);
	}

	public static int getVocabularyCategoriesCount(
		long groupId, String name, long vocabularyId) {

		return getService().getVocabularyCategoriesCount(
			groupId, name, vocabularyId);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			getVocabularyCategoriesDisplay(
				long vocabularyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.asset.kernel.model.AssetCategory> obc)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVocabularyCategoriesDisplay(
			vocabularyId, start, end, obc);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			getVocabularyCategoriesDisplay(
				long groupId, String name, long vocabularyId, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.asset.kernel.model.AssetCategory> obc)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVocabularyCategoriesDisplay(
			groupId, name, vocabularyId, start, end, obc);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		getVocabularyRootCategories(
			long groupId, long vocabularyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory> obc) {

		return getService().getVocabularyRootCategories(
			groupId, vocabularyId, start, end, obc);
	}

	public static int getVocabularyRootCategoriesCount(
		long groupId, long vocabularyId) {

		return getService().getVocabularyRootCategoriesCount(
			groupId, vocabularyId);
	}

	public static com.liferay.asset.kernel.model.AssetCategory moveCategory(
			long categoryId, long parentCategoryId, long vocabularyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().moveCategory(
			categoryId, parentCategoryId, vocabularyId, serviceContext);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetCategory>
		search(
			long groupId, String keywords, long vocabularyId, int start,
			int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetCategory> obc) {

		return getService().search(
			groupId, keywords, vocabularyId, start, end, obc);
	}

	public static com.liferay.portal.kernel.json.JSONArray search(
			long groupId, String name, String[] categoryProperties, int start,
			int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().search(
			groupId, name, categoryProperties, start, end);
	}

	public static com.liferay.portal.kernel.json.JSONArray search(
			long[] groupIds, String name, long[] vocabularyIds, int start,
			int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().search(groupIds, name, vocabularyIds, start, end);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long groupId, String title, long vocabularyId, int start,
				int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupId, title, vocabularyId, start, end);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long groupId, String title, long parentCategoryId,
				long vocabularyId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupId, title, parentCategoryId, vocabularyId, start, end);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long groupId, String title, long vocabularyId,
				long parentCategoryId, int start, int end,
				com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupId, title, vocabularyId, parentCategoryId, start, end, sort);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long[] groupIds, String title, long[] vocabularyIds, int start,
				int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupIds, title, vocabularyIds, start, end);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long[] groupIds, String title, long[] parentCategoryIds,
				long[] vocabularyIds, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupIds, title, parentCategoryIds, vocabularyIds, start, end);
	}

	public static com.liferay.asset.kernel.model.AssetCategoryDisplay
			searchCategoriesDisplay(
				long[] groupIds, String title, long[] vocabularyIds,
				long[] parentCategoryIds, int start, int end,
				com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCategoriesDisplay(
			groupIds, title, vocabularyIds, parentCategoryIds, start, end,
			sort);
	}

	public static com.liferay.asset.kernel.model.AssetCategory updateCategory(
			long categoryId, long parentCategoryId,
			java.util.Map<java.util.Locale, String> titleMap,
			java.util.Map<java.util.Locale, String> descriptionMap,
			long vocabularyId, String[] categoryProperties,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCategory(
			categoryId, parentCategoryId, titleMap, descriptionMap,
			vocabularyId, categoryProperties, serviceContext);
	}

	public static AssetCategoryService getService() {
		if (_service == null) {
			_service = (AssetCategoryService)PortalBeanLocatorUtil.locate(
				AssetCategoryService.class.getName());

			ReferenceRegistry.registerReference(
				AssetCategoryServiceUtil.class, "_service");
		}

		return _service;
	}

	private static AssetCategoryService _service;

}