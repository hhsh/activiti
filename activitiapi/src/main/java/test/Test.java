package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.persistence.entity.VariableInstanceEntity;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;


public class Test {
	static ProcessEngine processEngine = null;
	public static void main(String[] args) { 
		init();
		 //deploy();
		//start();
		listTask();
		//complete();
	}
	
	public static void init(){
		ProcessEngineConfiguration config = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml"); 
		processEngine = config.buildProcessEngine();
	}
	public static void deploy(){
		//processEngine = ProcessEngines.getDefaultProcessEngine();
		RepositoryService repositoryService = processEngine.getRepositoryService();
		
		//奇怪，必须用这个名字：VacationRequest.bpmn20.xml
		
		/*
		 * 
		 * 使用mybatis作为底层dao接口
		 */
		repositoryService.createDeployment().addClasspathResource("VacationRequest.bpmn20.xml").deploy();
		info("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
	}
	public static void start() {
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("employeeName", "Kermit");
		variables.put("numberOfDays", new Integer(4));
		variables.put("vacationMotivation", "I'm really tired!");

		RuntimeService runtimeService = processEngine.getRuntimeService();
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacationRequest", variables);

		// Verify that we started a new process instance
		info("Number of process instances: " + runtimeService.createProcessInstanceQuery().count());
	}
	
	public static void listTask(){
		// Fetch all tasks for the management group
//		TaskService taskService = processEngine.getTaskService();
//		List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
//		for (Task task : tasks) {
//		  info("Task available: " + task.getName());
//		}
//		
//		
//		tasks = taskService.createTaskQuery()
//			    .taskAssignee("kermit")
//			    .processVariableValueEquals("orderId", "0815")
//			    .list();
//		
//		for (Task task : tasks) {
//		  info("Task available: " + task.getName());
//		}
//		
		ManagementService managementService = processEngine.getManagementService();
//		tasks = taskService.createNativeTaskQuery()
//				  .sql("SELECT count(*) FROM " + managementService.getTableName(Execution.class) + " T WHERE T.NAME_ = #{taskName}")
//				  .parameter("taskName", "gonzoTask")
//				  .list();
//
//		long count = taskService.createNativeTaskQuery()
//		  .sql("SELECT count(*) FROM " + managementService.getTableName(Task.class) + " T1, "
//		    + managementService.getTableName(VariableInstanceEntity.class) + " V1 WHERE V1.TASK_ID_ = T1.ID_")
//		  .count();
				
		
		RuntimeService runtimeService = processEngine.getRuntimeService();

		runtimeService.createNativeExecutionQuery()
		.sql("update " + managementService.getTableName(Execution.class) + " set BUSINESS_KEY_ = 100 ")
		.singleResult();

//		TaskQuery taskQuery = taskService.createTaskQuery();
//		taskQuery.processVariableValueEquals("xmsb_Id", 223);
		
	}
	
	public static void complete(){
		
		TaskService taskService = processEngine.getTaskService();
		List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
		
		Task task = tasks.get(0);

		Map<String, Object> taskVariables = new HashMap<String, Object>();
		taskVariables.put("vacationApproved", "false");
		taskVariables.put("managerMotivation", "We have a tight deadline!");
		taskService.complete(task.getId(), taskVariables);
	}
	
	public static void info(String info){
		System.out.println(info);
	}


}
