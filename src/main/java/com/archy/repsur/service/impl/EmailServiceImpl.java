package com.archy.repsur.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.archy.repsur.bean.ContactoBean;
import com.archy.repsur.service.EmailService;

import javax.mail.internet.MimeMessage;

@Component
public class EmailServiceImpl implements EmailService{
	
	@Autowired
    private JavaMailSender emailSender;

	@Override
	public void enviarEmailContacto(ContactoBean contacto) throws Exception {
		MimeMessage mimeMessage = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		String html = "<table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n"
				+ "   <tbody>\r\n"
				+ "      <tr>\r\n"
				+ "         <td class=\"esd-email-paddings ui-droppable\" valign=\"top\">\r\n"
				+ "            <table cellpadding=\"0\" cellspacing=\"0\" class=\"esd-header-popover es-header ui-draggable\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-header-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"background-color: transparent;\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure\" align=\"left\" style=\"border-radius: 10px 10px 0px 0px; background-color: #e58407; padding: 13px\" bgcolor=\"#3bb814\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"570\" class=\"es-m-p0r esd-container-frame esd-frame esd-hover esdev-disable-select\" valign=\"top\" align=\"center\" esd-handler-name=\"containerHandler\">\r\n"
				+ "\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-radius: 1px; border-collapse: separate;\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-text esd-frame esd-hover esd-draggable esd-block esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "\r\n"
				+ "                                                            <p style=\"font-size: 24px; color: #ffffff;\"><strong>ER REPRESENTACIONES DEL SUR</strong></p>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "            <table class=\"es-content ui-draggable\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-content-body\" style=\"border-left:1px solid #4c8aa7;border-right:1px solid #4c8aa7;background-color: #ffffff;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame esdev-disable-select es-p20r es-p20l esd-hover\" align=\"left\" bgcolor=\"#ffffff\" style=\"background-color: #ffffff;\" esdev-eq=\"false\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"558\" align=\"left\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" style=\"padding-left:40px; padding-right:40px;\" class=\"esd-block-text es-m-txt-c esd-frame esd-hover esd-draggable esd-block es-p10t es-p15b esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "															<h2><strong>Se envió un correo desde la web ER Representaciones del Sur.</strong></h2>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-image es-p15r esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size: 0px;\" esd-handler-name=\"imgBlockHandler\">\r\n"
				+ "                                                            <img class=\"adapt-img\" src=\"cid:imageEr\" alt=\"\" style=\"display: block;\" width=\"180\">\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td class=\"es-m-p0r esd-container-frame esd-frame esd-hover esdev-disable-select\" width=\"558\" valign=\"top\" align=\"center\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\" style=\"font-size:15px\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"left\" style=\"padding-left:10px; padding-right:10px;\">\r\n"
				+ "                                                            <strong>Nombre:&nbsp;</strong>"+contacto.getNombre()+"\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"left\" style=\"padding-left:10px; padding-right:10px;\">\r\n"
				+ "                                                            <strong>Celular:&nbsp;</strong>"+contacto.getCelular()+"\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "													  <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"left\" style=\"padding-left:10px; padding-right:10px;\">\r\n"
				+ "                                                            <strong>Correo:&nbsp;</strong>"+contacto.getCorreo()+"\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "													  <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"left\" style=\"padding-left:10px; padding-right:10px;\">\r\n"
				+ "                                                            <strong>Asunto:&nbsp;</strong>"+contacto.getMotivo()+"\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "													  <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"left\" style=\"padding-left:10px; padding-right:10px;\">\r\n"
				+ "                                                            <strong>Mensaje:&nbsp;</strong>"+contacto.getMensaje()+"\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-spacer es-p5t es-p5b es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size:0\" esd-handler-name=\"spacerBlockHandler\">\r\n"
				+ "\r\n"
				+ "                                                            <table border=\"0\" width=\"35%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"display: inline-table; width: 60% !important;\">\r\n"
				+ "                                                               <tbody>\r\n"
				+ "                                                                  <tr>\r\n"
				+ "                                                                     <td style=\"border-bottom: 2px solid #fb8500; background: none; height: 1px; width: 100%; margin: 0px;\"></td>\r\n"
				+ "                                                                  </tr>\r\n"
				+ "                                                               </tbody>\r\n"
				+ "                                                            </table>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame esdev-disable-select es-p5t es-p5b es-p40r es-p40l esd-hover\" align=\"left\" esdev-eq=\"true\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"518\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" align=\"center\" valign=\"top\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-button es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" esd-handler-name=\"btnBlockHandler\">\r\n"
				+ "                                                               <a href=\"http://representacionesdelsur.com\"  target=\"_blank\" style=\"padding: 10px 25px 10px 15px;\">\r\n"
				+ "																  <img class=\"adapt-img\" src=\"cid:imageCerdena\" alt=\"\" style=\"display: block;\" width=\"100\">\r\n"
				+ "                                                               </a>\r\n"
				+ "                                                         </td>\r\n"
				+ "														 <td align=\"center\" class=\"esd-block-button es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" esd-handler-name=\"btnBlockHandler\">\r\n"
				+ "                                                               <a href=\"http://representacionesdelsur.com\"  target=\"_blank\" style=\"padding: 10px 25px 10px 15px;\">\r\n"
				+ "																  <img class=\"adapt-img\" src=\"cid:imageFarmfrite\" alt=\"\" style=\"display: block;\" width=\"100\">\r\n"
				+ "                                                               </a>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "            <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer ui-draggable esd-footer-popover\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-footer-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"background-color: transparent;\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame\" align=\"left\" style=\"padding:20px; border-radius: 0px 0px 10px 10px; background-color: #e58407;\" bgcolor=\"#3bb814\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"560\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" align=\"left\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-social esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size:0\" esd-handler-name=\"socialBlockHandler\">\r\n"
				+ "                                                            <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-table-not-adapt es-social\">\r\n"
				+ "                                                               <tbody>\r\n"
				+ "                                                                  <tr>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\" class=\"es-p20r\" style=\"padding-right:20px;\"><a target=\"_blank\" href=\"#\"><img title=\"Facebook\" src=\"cid:imageFace\" alt=\"Fb\" width=\"32\"></a></td>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\" class=\"es-p20r\" style=\"padding-right:20px;\"><a target=\"_blank\" href=\"#\"><img title=\"Instagram\" src=\"cid:imageInst\" alt=\"Inst\" width=\"32\"></a></td>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\"><a target=\"_blank\" href=\"#\"><img title=\"Youtube\" src=\"cid:imageYout\" alt=\"Yt\" width=\"32\"></a></td>\r\n"
				+ "                                                                  </tr>\r\n"
				+ "                                                               </tbody>\r\n"
				+ "                                                            </table>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "         </td>\r\n"
				+ "      </tr>\r\n"
				+ "   </tbody>\r\n"
				+ "</table>\n";
		
		helper.setFrom("marketing@representacionesdelsur.com");
//        helper.setTo(contacto.getCorreo());
		helper.setCc("soporteweb@representacionesdelsur.com");
		helper.setTo("marketing@representacionesdelsur.com"); 
        helper.setSubject("Correo de contacto desde la web ER Representaciones del sur"); 
        helper.setText(html,true);
        helper.addInline("imageEr", new ClassPathResource("static/assets/img/logo_ER_GRANDE.png"));
        helper.addInline("imageCerdena", new ClassPathResource("static/assets/img/correo_cerdena.jpg"));
        helper.addInline("imageFarmfrite", new ClassPathResource("static/assets/img/correo_farmfrite.jpg"));
        helper.addInline("imageFace", new ClassPathResource("static/assets/img/facebook-circle-white.png"));
        helper.addInline("imageYout", new ClassPathResource("static/assets/img/youtube-circle-white.png"));
        helper.addInline("imageTwit", new ClassPathResource("static/assets/img/twitter-circle-white.png"));
        helper.addInline("imageInst", new ClassPathResource("static/assets/img/instagram-circle-white.png"));
        emailSender.send(mimeMessage);
		
	}
	
	@Override
	public void enviarEmailRespuestaContacto(ContactoBean contacto) throws Exception {
		MimeMessage mimeMessage = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		String html = "<table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n"
				+ "   <tbody>\r\n"
				+ "      <tr>\r\n"
				+ "         <td class=\"esd-email-paddings ui-droppable\" valign=\"top\">\r\n"
				+ "            <table cellpadding=\"0\" cellspacing=\"0\" class=\"esd-header-popover es-header ui-draggable\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-header-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"background-color: transparent;\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure\" align=\"left\" style=\"border-radius: 10px 10px 0px 0px; background-color: #e58407; padding: 13px\" bgcolor=\"#3bb814\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"570\" class=\"es-m-p0r esd-container-frame esd-frame esd-hover esdev-disable-select\" valign=\"top\" align=\"center\" esd-handler-name=\"containerHandler\">\r\n"
				+ "\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-radius: 1px; border-collapse: separate;\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-text esd-frame esd-hover esd-draggable esd-block esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "\r\n"
				+ "                                                            <p style=\"font-size: 24px; color: #ffffff;\"><strong>ER REPRESENTACIONES DEL SUR</strong></p>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "            <table class=\"es-content ui-draggable\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-content-body\" style=\"border-left:1px solid #4c8aa7;border-right:1px solid #4c8aa7;background-color: #ffffff;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame esdev-disable-select es-p20r es-p20l esd-hover\" align=\"left\" bgcolor=\"#ffffff\" style=\"background-color: #ffffff;\" esdev-eq=\"false\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"558\" align=\"left\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-text es-m-txt-c esd-frame esd-hover esd-draggable esd-block es-p10t es-p15b esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "                                                            <h1><strong>"+contacto.getNombre()+"</strong></h1>\r\n"
				+ "                                                            <h1><strong>Gracias por contactarnos</strong>!</h1>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-image es-p15r esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size: 0px;\" esd-handler-name=\"imgBlockHandler\">\r\n"
				+ "                                                            <img class=\"adapt-img\" src=\"cid:imageEr\" alt=\"\" style=\"display: block;\" width=\"200\">\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td class=\"es-m-p0r esd-container-frame esd-frame esd-hover esdev-disable-select\" width=\"558\" valign=\"top\" align=\"center\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-text es-m-txt-c esd-frame esd-hover esd-draggable esd-block es-p10t es-p5b esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "                                                            <h1>Nos pondremos en contacto en breve.</h1>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-text esd-frame esd-hover esd-draggable esd-block es-p10t es-p15b es-p40r es-p40l esdev-disable-select\" esd-handler-name=\"textElementHandler\">\r\n"
				+ "                                                            <p>Los mejores embutidos y papas de calidad superior.&nbsp;</p>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-spacer es-p5t es-p5b es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size:0\" esd-handler-name=\"spacerBlockHandler\">\r\n"
				+ "\r\n"
				+ "                                                            <table border=\"0\" width=\"35%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"display: inline-table; width: 60% !important;\">\r\n"
				+ "                                                               <tbody>\r\n"
				+ "                                                                  <tr>\r\n"
				+ "                                                                     <td style=\"border-bottom: 2px solid #fb8500; background: none; height: 1px; width: 100%; margin: 0px;\"></td>\r\n"
				+ "                                                                  </tr>\r\n"
				+ "                                                               </tbody>\r\n"
				+ "                                                            </table>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame esdev-disable-select es-p5t es-p5b es-p40r es-p40l esd-hover\" align=\"left\" esdev-eq=\"true\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"518\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" align=\"center\" valign=\"top\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-button es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" esd-handler-name=\"btnBlockHandler\">\r\n"
				+ "                                                               <a href=\"http://representacionesdelsur.com\"  target=\"_blank\" style=\"padding: 10px 25px 10px 15px;\">\r\n"
				+ "																  <img class=\"adapt-img\" src=\"cid:imageCerdena\" alt=\"\" style=\"display: block;\" width=\"100\">\r\n"
				+ "                                                               </a>\r\n"
				+ "                                                         </td>\r\n"
				+ "														 <td align=\"center\" class=\"esd-block-button es-m-txt-c esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" esd-handler-name=\"btnBlockHandler\">\r\n"
				+ "                                                               <a href=\"http://representacionesdelsur.com\"  target=\"_blank\" style=\"padding: 10px 25px 10px 15px;\">\r\n"
				+ "																  <img class=\"adapt-img\" src=\"cid:imageFarmfrite\" alt=\"\" style=\"display: block;\" width=\"100\">\r\n"
				+ "                                                               </a>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "            <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer ui-draggable esd-footer-popover\" align=\"center\">\r\n"
				+ "               <tbody>\r\n"
				+ "                  <tr>\r\n"
				+ "                     <td class=\"esd-stripe esd-frame esdev-disable-select esd-hover\" align=\"center\" esd-handler-name=\"stripeBlockHandler\">\r\n"
				+ "                        <table class=\"es-footer-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"background-color: transparent;\">\r\n"
				+ "                           <tbody class=\"ui-droppable\">\r\n"
				+ "                              <tr class=\"ui-draggable\">\r\n"
				+ "                                 <td class=\"esd-structure esd-frame\" align=\"left\" style=\"padding:20px; border-radius: 0px 0px 10px 10px; background-color: #e58407;\" bgcolor=\"#3bb814\" esd-handler-name=\"structureBlockHandler\">\r\n"
				+ "                                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                       <tbody class=\"ui-droppable\">\r\n"
				+ "                                          <tr class=\"ui-draggable\">\r\n"
				+ "                                             <td width=\"560\" class=\"esd-container-frame esd-frame esd-hover esdev-disable-select\" align=\"left\" esd-handler-name=\"containerHandler\">\r\n"
				+ "                                                <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
				+ "                                                   <tbody class=\"ui-droppable\">\r\n"
				+ "                                                      <tr class=\"ui-draggable\">\r\n"
				+ "                                                         <td align=\"center\" class=\"esd-block-social esd-frame esd-hover esdev-disable-select esd-draggable esd-block\" style=\"font-size:0\" esd-handler-name=\"socialBlockHandler\">\r\n"
				+ "                                                            <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-table-not-adapt es-social\">\r\n"
				+ "                                                               <tbody>\r\n"
				+ "                                                                  <tr>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\" class=\"es-p20r\" style=\"padding-right:20px;\"><a target=\"_blank\" href=\"#\"><img title=\"Facebook\" src=\"cid:imageFace\" alt=\"Fb\" width=\"32\"></a></td>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\" class=\"es-p20r\" style=\"padding-right:20px;\"><a target=\"_blank\" href=\"#\"><img title=\"Instagram\" src=\"cid:imageInst\" alt=\"Inst\" width=\"32\"></a></td>\r\n"
				+ "                                                                     <td align=\"center\" valign=\"top\"><a target=\"_blank\" href=\"#\"><img title=\"Youtube\" src=\"cid:imageYout\" alt=\"Yt\" width=\"32\"></a></td>\r\n"
				+ "                                                                  </tr>\r\n"
				+ "                                                               </tbody>\r\n"
				+ "                                                            </table>\r\n"
				+ "                                                         </td>\r\n"
				+ "                                                      </tr>\r\n"
				+ "                                                   </tbody>\r\n"
				+ "                                                </table>\r\n"
				+ "                                             </td>\r\n"
				+ "                                          </tr>\r\n"
				+ "                                       </tbody>\r\n"
				+ "                                    </table>\r\n"
				+ "                                 </td>\r\n"
				+ "                              </tr>\r\n"
				+ "                           </tbody>\r\n"
				+ "                        </table>\r\n"
				+ "                     </td>\r\n"
				+ "                  </tr>\r\n"
				+ "               </tbody>\r\n"
				+ "            </table>\r\n"
				+ "         </td>\r\n"
				+ "      </tr>\r\n"
				+ "   </tbody>\r\n"
				+ "</table>\n";
		
		helper.setFrom("marketing@representacionesdelsur.com");
		helper.setCc("soporteweb@representacionesdelsur.com");
        helper.setTo(contacto.getCorreo()); 
        helper.setSubject("Correo de contacto desde la web ER Representaciondes del Sur"); 
        helper.setText(html,true);
        helper.addInline("imageEr", new ClassPathResource("static/assets/img/logo_ER_GRANDE.png"));
        helper.addInline("imageCerdena", new ClassPathResource("static/assets/img/correo_cerdena.jpg"));
        helper.addInline("imageFarmfrite", new ClassPathResource("static/assets/img/correo_farmfrite.jpg"));
        helper.addInline("imageFace", new ClassPathResource("static/assets/img/facebook-circle-white.png"));
        helper.addInline("imageYout", new ClassPathResource("static/assets/img/youtube-circle-white.png"));
        helper.addInline("imageTwit", new ClassPathResource("static/assets/img/twitter-circle-white.png"));
        helper.addInline("imageInst", new ClassPathResource("static/assets/img/instagram-circle-white.png"));
        emailSender.send(mimeMessage);
		
	}

}