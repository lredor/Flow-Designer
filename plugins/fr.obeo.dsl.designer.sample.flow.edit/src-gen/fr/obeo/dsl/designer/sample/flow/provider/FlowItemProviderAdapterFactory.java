/**
 * Copyright  2010 Obeo. All Rights Reserved.
 *
 * This file is part of Obeo Designer.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1, L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 */
package fr.obeo.dsl.designer.sample.flow.provider;

import fr.obeo.dsl.designer.sample.flow.util.FlowAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowItemProviderAdapterFactory extends FlowAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
     * This constructs an instance.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.StateProcessor} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StateProcessorItemProvider stateProcessorItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.StateProcessor}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createStateProcessorAdapter() {
        if (stateProcessorItemProvider == null) {
            stateProcessorItemProvider = new StateProcessorItemProvider(this);
        }

        return stateProcessorItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.Processor} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ProcessorItemProvider processorItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.Processor}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createProcessorAdapter() {
        if (processorItemProvider == null) {
            processorItemProvider = new ProcessorItemProvider(this);
        }

        return processorItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.Fan} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FanItemProvider fanItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.Fan}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFanAdapter() {
        if (fanItemProvider == null) {
            fanItemProvider = new FanItemProvider(this);
        }

        return fanItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.Physical} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhysicalItemProvider physicalItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.Physical}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPhysicalAdapter() {
        if (physicalItemProvider == null) {
            physicalItemProvider = new PhysicalItemProvider(this);
        }

        return physicalItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.CompositeProcessor} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeProcessorItemProvider compositeProcessorItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.CompositeProcessor}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCompositeProcessorAdapter() {
        if (compositeProcessorItemProvider == null) {
            compositeProcessorItemProvider = new CompositeProcessorItemProvider(this);
        }

        return compositeProcessorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.DataFlow} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.DataFlow}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createDataFlowAdapter() {
        if (dataFlowItemProvider == null) {
            dataFlowItemProvider = new DataFlowItemProvider(this);
        }

        return dataFlowItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.CapacityBound} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CapacityBoundItemProvider capacityBoundItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.CapacityBound}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createCapacityBoundAdapter() {
        if (capacityBoundItemProvider == null) {
            capacityBoundItemProvider = new CapacityBoundItemProvider(this);
        }

        return capacityBoundItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.System} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SystemItemProvider systemItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.System}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createSystemAdapter() {
        if (systemItemProvider == null) {
            systemItemProvider = new SystemItemProvider(this);
        }

        return systemItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.PowerOutput} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerOutputItemProvider powerOutputItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.PowerOutput}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPowerOutputAdapter() {
        if (powerOutputItemProvider == null) {
            powerOutputItemProvider = new PowerOutputItemProvider(this);
        }

        return powerOutputItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.PowerInput} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerInputItemProvider powerInputItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.PowerInput}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPowerInputAdapter() {
        if (powerInputItemProvider == null) {
            powerInputItemProvider = new PowerInputItemProvider(this);
        }

        return powerInputItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.PowerLink} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerLinkItemProvider powerLinkItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.PowerLink}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPowerLinkAdapter() {
        if (powerLinkItemProvider == null) {
            powerLinkItemProvider = new PowerLinkItemProvider(this);
        }

        return powerLinkItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.DataSource} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DataSourceItemProvider dataSourceItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.DataSource}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createDataSourceAdapter() {
        if (dataSourceItemProvider == null) {
            dataSourceItemProvider = new DataSourceItemProvider(this);
        }

        return dataSourceItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.State} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StateItemProvider stateItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.State}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createStateAdapter() {
        if (stateItemProvider == null) {
            stateItemProvider = new StateItemProvider(this);
        }

        return stateItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.ComputationResult} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ComputationResultItemProvider computationResultItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.ComputationResult}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createComputationResultAdapter() {
        if (computationResultItemProvider == null) {
            computationResultItemProvider = new ComputationResultItemProvider(this);
        }

        return computationResultItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.Event} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EventItemProvider eventItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.Event}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createEventAdapter() {
        if (eventItemProvider == null) {
            eventItemProvider = new EventItemProvider(this);
        }

        return eventItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link fr.obeo.dsl.designer.sample.flow.Operation} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected OperationItemProvider operationItemProvider;

	/**
     * This creates an adapter for a {@link fr.obeo.dsl.designer.sample.flow.Operation}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createOperationAdapter() {
        if (operationItemProvider == null) {
            operationItemProvider = new OperationItemProvider(this);
        }

        return operationItemProvider;
    }

	/**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

	/**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

	/**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

	/**
     * This adds a listener.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

	/**
     * This removes a listener.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

	/**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

	/**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void dispose() {
        if (stateProcessorItemProvider != null) stateProcessorItemProvider.dispose();
        if (processorItemProvider != null) processorItemProvider.dispose();
        if (fanItemProvider != null) fanItemProvider.dispose();
        if (physicalItemProvider != null) physicalItemProvider.dispose();
        if (compositeProcessorItemProvider != null) compositeProcessorItemProvider.dispose();
        if (dataFlowItemProvider != null) dataFlowItemProvider.dispose();
        if (capacityBoundItemProvider != null) capacityBoundItemProvider.dispose();
        if (systemItemProvider != null) systemItemProvider.dispose();
        if (powerOutputItemProvider != null) powerOutputItemProvider.dispose();
        if (powerInputItemProvider != null) powerInputItemProvider.dispose();
        if (powerLinkItemProvider != null) powerLinkItemProvider.dispose();
        if (dataSourceItemProvider != null) dataSourceItemProvider.dispose();
        if (stateItemProvider != null) stateItemProvider.dispose();
        if (computationResultItemProvider != null) computationResultItemProvider.dispose();
        if (eventItemProvider != null) eventItemProvider.dispose();
        if (operationItemProvider != null) operationItemProvider.dispose();
    }

}
