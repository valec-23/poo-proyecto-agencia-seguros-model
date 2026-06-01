import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalDateTime ahora = LocalDateTime.now();

        // ============================================================
        // 1. DATOS DE LA EMPRESA, SUCURSAL Y EQUIPO DE TRABAJO
        // ============================================================
        Sucursal sucursal = new Sucursal(
                1,
                "Aseguradora Sucre - Cuenca Centro",
                "Av. Solano y 12 de Abril",
                "072-555-100",
                "Cuenca",
                "Ing. Carlos Andrade",
                true
        );

        Empleado empleado = new Empleado(
                "EMP-001",
                "Analista de reclamos",
                "Gestion de Reclamos",
                850.00,
                hoy.minusYears(2),
                "Activo"
        );
        empleado.setSucursal(sucursal);
        sucursal.getEmpleadoList().add(empleado);

        Permiso permisoReclamos = new Permiso(
                1,
                "GESTIONAR_RECLAMOS",
                "Permite revisar, aprobar o rechazar reclamos de seguros",
                "Reclamos",
                true
        );

        Permiso permisoDashboard = new Permiso(
                2,
                "VER_DASHBOARD",
                "Permite consultar indicadores del negocio y madurez digital",
                "Dashboard",
                true
        );

        Rol rolAnalista = new Rol(
                1,
                "Analista de seguros",
                "Usuario interno encargado de revisar polizas, pagos y reclamos",
                3,
                true,
                "Rol operativo"
        );
        rolAnalista.getPermisoList().add(permisoReclamos);
        rolAnalista.getPermisoList().add(permisoDashboard);

        UsuarioInterno usuarioInterno = new UsuarioInterno(
                1,
                "Gestion de Reclamos",
                "Analista interno",
                "Medio",
                "Matutino",
                true
        );
        usuarioInterno.setIdUsuario(1001);
        usuarioInterno.setUsername("analista.reclamos");
        usuarioInterno.setCorreo("reclamos@asegsucre.ec");
        usuarioInterno.setEstado(true);
        usuarioInterno.setFechaCreacion(hoy.minusMonths(8));
        usuarioInterno.setUltimoAcceso(ahora);
        usuarioInterno.setRol(rolAnalista);
        empleado.setUsuario(usuarioInterno);

        BitacoraSistema bitacora = new BitacoraSistema(
                1,
                ahora,
                "Consulta de reclamo",
                "Reclamos",
                usuarioInterno.getUsername(),
                "El usuario reviso el reclamo REC-001 desde el modulo digital",
                "192.168.1.25"
        );
        usuarioInterno.getBitacoraSistemaList().add(bitacora);

        // ============================================================
        // 2. GESTION COMERCIAL: CLIENTE, AGENTE, SEGUROS Y POLIZAS
        // ============================================================
        Cliente cliente = new Cliente(
                "CLI-001",
                "Natural",
                hoy.minusMonths(7),
                1,
                "Medio",
                84.5
        );
        cliente.setIdPersona(1);
        cliente.setNombre("David");
        cliente.setApellidos("Toledo");
        cliente.setCedula("0102030405");
        cliente.setCorreo("david.toledo@email.com");
        cliente.setTelefono("0999999999");
        cliente.setDireccion("Cuenca - Ecuador");
        cliente.setFechaNacimiento(LocalDate.of(2007, 1, 24));
        cliente.setEstado(true);

        Agente agente = new Agente(
                "AG-001",
                9.5,
                sucursal.getNombreSucursal(),
                "Seguros vehiculares y medicos",
                18,
                "Activo"
        );
        agente.setIdPersona(2);
        agente.setNombre("Mateo");
        agente.setApellidos("Salazar");
        agente.setCedula("0109090807");
        agente.setCorreo("mateo.salazar@asegsucre.ec");
        agente.setTelefono("0988888888");
        agente.setDireccion("Cuenca - Ecuador");
        agente.setFechaNacimiento(LocalDate.of(1995, 8, 12));
        agente.setEstado(true);
        cliente.setAgente(agente);

        SeguroVehicular seguroVehicular = new SeguroVehicular(
                1,
                "Automovil liviano",
                "ABC-1234",
                "Hyundai Sonata Hibrido",
                2022,
                28500.00,
                42000.00
        );
        seguroVehicular.setIdSeguro(1);
        seguroVehicular.setNombreSeguro("Seguro Vehicular Plus");
        seguroVehicular.setTipoSeguro("Vehicular");
        seguroVehicular.setDescripcion("Cobertura para danos, robo, accidentes y asistencia vial");
        seguroVehicular.setCoberturaMaxima(25000.00);
        seguroVehicular.setCostoBase(65.00);
        seguroVehicular.setNivelRiesgo("Medio");
        seguroVehicular.setEstado(true);

        SeguroMedico seguroMedico = new SeguroMedico(
                2,
                "Plan ambulatorio y hospitalario",
                "Red medica AustroSalud",
                15000.00,
                "Ninguna registrada",
                "Plan Familiar"
        );
        seguroMedico.setIdSeguro(2);
        seguroMedico.setNombreSeguro("Seguro Medico Familiar");
        seguroMedico.setTipoSeguro("Medico");
        seguroMedico.setDescripcion("Cobertura para consultas, emergencias y hospitalizacion");
        seguroMedico.setCoberturaMaxima(15000.00);
        seguroMedico.setCostoBase(48.00);
        seguroMedico.setNivelRiesgo("Bajo");
        seguroMedico.setEstado(true);

        Poliza polizaVehicular = new Poliza(
                1,
                "POL-VEH-001",
                hoy.minusMonths(3),
                hoy.plusMonths(9),
                "Activa",
                25000.00,
                72.50,
                "Vehicular",
                true
        );

        Poliza polizaMedica = new Poliza(
                2,
                "POL-MED-002",
                hoy.minusMonths(1),
                hoy.plusYears(1),
                "Activa",
                15000.00,
                55.00,
                "Medica",
                true
        );

        Cobertura coberturaVehicular = new Cobertura(
                1,
                "Cobertura contra accidentes y robo",
                "Cubre danos materiales, robo parcial y asistencia vial",
                25000.00,
                85.0,
                true
        );
        coberturaVehicular.setPoliza(polizaVehicular);
        polizaVehicular.setCobertura(coberturaVehicular);

        Cobertura coberturaMedica = new Cobertura(
                2,
                "Cobertura medica familiar",
                "Cubre consultas, emergencias y hospitalizacion",
                15000.00,
                80.0,
                true
        );
        coberturaMedica.setPoliza(polizaMedica);
        polizaMedica.setCobertura(coberturaMedica);

        cliente.getPolizaList().add(polizaVehicular);
        cliente.getPolizaList().add(polizaMedica);
        agente.getPolizaList().add(polizaVehicular);
        agente.getPolizaList().add(polizaMedica);
        seguroVehicular.getPolizaList().add(polizaVehicular);
        seguroMedico.getPolizaList().add(polizaMedica);
        seguroVehicular.getCoberturaList().add(coberturaVehicular);
        seguroMedico.getCoberturaList().add(coberturaMedica);

        // ============================================================
        // 3. GESTION FINANCIERA: PAGOS, FACTURA Y TRANSACCIONES
        // ============================================================
        MetodoPago metodoPago = new MetodoPago(
                1,
                "Transferencia bancaria",
                "Banco Pichincha",
                "REF-MP-2026-001",
                true,
                1.25
        );

        TransferenciaBancaria transferencia = new TransferenciaBancaria(
                1,
                "Banco Pichincha",
                "Banco del Austro",
                "2200112233",
                "TRX-2026-0001",
                hoy,
                "Confirmada"
        );

        PagoTarjeta pagoTarjeta = new PagoTarjeta(
                1,
                "**** **** **** 4589",
                "Credito",
                "Visa Banco Pichincha",
                "***",
                hoy.plusYears(2),
                "David Toledo"
        );

        PagoEfectivo pagoEfectivo = new PagoEfectivo(
                1,
                "Pago presencial",
                "Caja principal",
                75.00,
                sucursal.getNombreSucursal(),
                "REC-EF-001",
                hoy,
                "Cajera principal"
        );

        PagoPrima pagoPrima = new PagoPrima(
                1,
                hoy,
                polizaVehicular.getPrimaMensual(),
                metodoPago.getTipoMetodo(),
                "Pagado",
                transferencia.getCodigoTransferencia(),
                "Pago mensual de poliza vehicular",
                "Prima mensual"
        );

        HistorialPago historialPago = new HistorialPago(
                1,
                hoy,
                435.00,
                1,
                12.50,
                "Al dia con una cuota proxima a vencer"
        );
        cliente.setHistorialPago(historialPago);

        Factura factura = new Factura(
                1,
                "FAC-001-2026",
                hoy,
                72.50,
                8.70,
                81.20,
                "Pagada"
        );
        factura.setPagoPrima(pagoPrima);

        DetalleFactura detalleFactura = new DetalleFactura(
                1,
                "Prima mensual seguro vehicular",
                1,
                polizaVehicular.getPrimaMensual(),
                polizaVehicular.getPrimaMensual()
        );
        detalleFactura.setFactura(factura);

        Transaccion transaccion = new Transaccion(
                1,
                "Cobro de prima",
                hoy,
                factura.getTotal(),
                "Aprobada",
                transferencia.getBancoOrigen(),
                transferencia.getCodigoTransferencia(),
                "USD"
        );
        transaccion.setMetodoPago(metodoPago);
        factura.getTransaccionList().add(transaccion);

        // ============================================================
        // 4. RECLAMOS, SINIESTROS, DOCUMENTOS E INSPECCION DIGITAL
        // ============================================================
        Siniestro siniestro = new Siniestro(
                1,
                hoy.minusDays(4),
                "Accidente de transito",
                "Choque lateral con danos en puerta y guardafango",
                "Av. de las Americas - Cuenca",
                3200.00,
                "Reportado",
                "Alta"
        );

        Reclamo reclamo = new Reclamo(
                1,
                "REC-001",
                hoy.minusDays(3),
                "Dano vehicular",
                "Cliente solicita cobertura por accidente de transito",
                3200.00,
                "En revision",
                "Medio",
                false,
                hoy.plusDays(5),
                "Pendiente de validacion final"
        );
        reclamo.setSiniestro(siniestro);
        polizaVehicular.getReclamoList().add(reclamo);

        InspeccionAutomatizada inspeccion = new InspeccionAutomatizada(
                1,
                "Analisis de imagenes con IA",
                "Dano moderado detectado en carroceria",
                42.5,
                hoy.minusDays(2)
        );
        reclamo.setInspeccionAutomatizada(inspeccion);

        Documento documentoCedula = new Documento(
                1,
                "cedula_cliente.pdf",
                "Identificacion",
                hoy.minusDays(3),
                "/docs/reclamos/cedula_cliente.pdf",
                1.2,
                "Validado"
        );
        documentoCedula.setReclamo(reclamo);
        documentoCedula.setInspeccionAutomatizada(inspeccion);

        Documento documentoFoto = new Documento(
                2,
                "foto_danio_vehiculo.jpg",
                "Evidencia fotografica",
                hoy.minusDays(3),
                "/docs/reclamos/foto_danio_vehiculo.jpg",
                3.8,
                "Validado por IA"
        );
        documentoFoto.setReclamo(reclamo);
        documentoFoto.setInspeccionAutomatizada(inspeccion);
        reclamo.getDocumentoList().add(documentoCedula);
        reclamo.getDocumentoList().add(documentoFoto);

        // ============================================================
        // 5. TRANSFORMACION DIGITAL, MADUREZ DIGITAL Y AUTOMATIZACION
        // ============================================================
        PortalAutogestion portal = new PortalAutogestion(
                1,
                "https://portal.aseguradorasucre.ec",
                true,
                1260,
                hoy.minusDays(10)
        );

        ChatbotSoporte chatbot = new ChatbotSoporte(
                1,
                "SucreBot",
                "Espanol",
                true,
                "Intermedio"
        );
        cliente.setChatbotSoporte(chatbot);
        reclamo.setChatbotSoporte(chatbot);

        UsuarioCliente usuarioCliente = new UsuarioCliente(
                1,
                hoy.minusMonths(7),
                ahora.minusHours(2),
                "iPhone / Navegador movil",
                true,
                "Verificado"
        );
        usuarioCliente.setIdUsuario(2001);
        usuarioCliente.setUsername("cliente.digital");
        usuarioCliente.setCorreo(cliente.getCorreo());
        usuarioCliente.setEstado(true);
        usuarioCliente.setFechaCreacion(hoy.minusMonths(7));
        usuarioCliente.setUltimoAcceso(ahora.minusHours(2));
        usuarioCliente.setChatbotSoporte(chatbot);
        usuarioCliente.setPortalAutogestion(portal);

        ContratoInteligente contratoInteligente = new ContratoInteligente(
                1,
                "SMART-POL-001",
                "Activo",
                hoy,
                "Ejecuta alertas de pago y validacion automatica de condiciones de poliza"
        );

        ProcesoDigital procesoReclamos = new ProcesoDigital(
                1,
                "Registro digital de reclamos",
                "Permite ingresar reclamos desde portal web y adjuntar evidencias",
                "Alto",
                12.5,
                true,
                "Area de Reclamos"
        );

        ProcesoDigital procesoPagos = new ProcesoDigital(
                2,
                "Seguimiento automatizado de pagos",
                "Controla pagos pendientes, mora y alertas de vencimiento",
                "Medio",
                8.0,
                true,
                "Area Financiera"
        );

        ProcesoDigital procesoFraude = new ProcesoDigital(
                3,
                "Validacion digital antifraude",
                "Evalua patrones de riesgo en reclamos y documentos cargados",
                "Medio",
                18.0,
                true,
                "Area de Auditoria"
        );

        List<ProcesoDigital> procesosDigitales = Arrays.asList(procesoReclamos, procesoPagos, procesoFraude);

        AreaEmpresa areaComercial = new AreaEmpresa(
                1,
                "Gestion Comercial",
                "Jefe Comercial",
                6,
                "Medio",
                true,
                "Administra clientes, agentes, polizas y renovaciones"
        );

        AreaEmpresa areaReclamos = new AreaEmpresa(
                2,
                "Gestion de Reclamos",
                "Coordinador de Reclamos",
                5,
                "Alto",
                true,
                "Gestiona siniestros, documentos, inspecciones y reclamos"
        );

        AreaEmpresa areaFinanciera = new AreaEmpresa(
                3,
                "Gestion Financiera",
                "Jefe Financiero",
                4,
                "Medio",
                true,
                "Controla pagos, facturas, transacciones y mora"
        );

        AreaEmpresa areaDigital = new AreaEmpresa(
                4,
                "Transformacion Digital",
                "Lider Digital",
                3,
                "Alto",
                true,
                "Evalua automatizacion, portal, chatbot, IA e indicadores"
        );

        EvaluacionMadurez evaluacionMadurez = new EvaluacionMadurez(
                1,
                hoy,
                78.5,
                "Medio - Alto",
                "La aseguradora posee canales digitales activos, pero debe fortalecer automatizacion y analisis de datos.",
                74.0,
                procesosDigitales.size()
        );

        NivelMadurez nivelMadurez = new NivelMadurez(
                1,
                "Nivel Medio - Alto",
                "La empresa utiliza herramientas digitales y ya mide varios procesos, pero aun puede integrar mas analitica y automatizacion.",
                70.0,
                "Etapa de crecimiento digital",
                89.0,
                true
        );

        RecomendacionDigital recomendacion1 = new RecomendacionDigital(
                1,
                "Integrar un dashboard gerencial con polizas, pagos, reclamos y madurez digital",
                "Alta",
                hoy,
                "Pendiente",
                "Mejor toma de decisiones y seguimiento en tiempo real",
                "Lider Digital"
        );

        RecomendacionDigital recomendacion2 = new RecomendacionDigital(
                2,
                "Automatizar alertas para polizas proximas a vencer y pagos pendientes",
                "Media",
                hoy,
                "En analisis",
                "Reduccion de mora y mayor retencion de clientes",
                "Area Financiera"
        );

        evaluacionMadurez.getRecomendacionDigitalList().add(recomendacion1);
        evaluacionMadurez.getRecomendacionDigitalList().add(recomendacion2);
        areaComercial.getEvaluacionMadurezList().add(evaluacionMadurez);
        areaReclamos.getEvaluacionMadurezList().add(evaluacionMadurez);
        areaFinanciera.getEvaluacionMadurezList().add(evaluacionMadurez);
        areaDigital.getEvaluacionMadurezList().add(evaluacionMadurez);

        List<AreaEmpresa> areas = Arrays.asList(areaComercial, areaReclamos, areaFinanciera, areaDigital);

        // ============================================================
        // 6. VALIDACION DE FRAUDE, ALERTAS Y ANALISIS FINANCIERO
        // ============================================================
        ValidacionFraude validacionFraude = new ValidacionFraude(
                1,
                "Validacion documental y patron de reclamo",
                "Compara documentos, historial del cliente, monto solicitado y frecuencia de reclamos",
                "Medio",
                hoy.minusDays(1),
                "Sin fraude confirmado, requiere revision humana",
                28.5,
                true
        );
        validacionFraude.setProcesoDigital(procesoFraude);

        AlertaFraude alertaFraude = new AlertaFraude(
                1,
                "Monto superior al promedio",
                "El monto solicitado supera el promedio de reclamos vehiculares similares",
                "Media",
                hoy.minusDays(1),
                "Abierta",
                "Solicitar inspeccion complementaria"
        );
        validacionFraude.getAlertaFraudeList().add(alertaFraude);
        reclamo.setValidacionFraude(validacionFraude);

        AnalisisFinanciero analisisFinanciero = new AnalisisFinanciero(
                1,
                3200.00,
                850.00,
                28.5,
                14,
                21.4,
                hoy,
                "Controlado"
        );
        analisisFinanciero.getTransaccionList().add(transaccion);
        reclamo.setAnalisisFinanciero(analisisFinanciero);

        // ============================================================
        // 7. INDICADORES PARA FUTURO DASHBOARD
        // ============================================================
        List<IndicadorDashboard> indicadores = new ArrayList<>();
        indicadores.add(new IndicadorDashboard(1, "Polizas activas", "Cantidad de polizas vigentes en el sistema", cliente.getPolizaList().size(), 10, "Negocio", hoy));
        indicadores.add(new IndicadorDashboard(2, "Reclamos en proceso", "Reclamos que aun no han sido cerrados", polizaVehicular.getReclamoList().size(), 5, "Reclamos", hoy));
        indicadores.add(new IndicadorDashboard(3, "Pagos pendientes", "Cuotas pendientes registradas en historial de pago", historialPago.getPagosPendientes(), 0, "Financiero", hoy));
        indicadores.add(new IndicadorDashboard(4, "Monto solicitado en reclamos", "Valor economico solicitado por reclamos activos", reclamo.getMontoSolicitado(), 5000, "Financiero", hoy));
        indicadores.add(new IndicadorDashboard(5, "Porcentaje de digitalizacion", "Nivel general de digitalizacion de la empresa", evaluacionMadurez.getPorcentajeDigitalizacion(), 90, "Madurez digital", hoy));
        indicadores.add(new IndicadorDashboard(6, "Procesos automatizados", "Procesos digitales activos dentro del modelo", contarProcesosActivos(procesosDigitales), 5, "Transformacion digital", hoy));
        indicadores.add(new IndicadorDashboard(7, "Probabilidad de fraude", "Porcentaje de sospecha calculado en validacion antifraude", validacionFraude.getPorcentajeFraude(), 30, "Fraude", hoy));
        indicadores.add(new IndicadorDashboard(8, "Usuarios activos en portal", "Clientes que utilizan el portal de autogestion", portal.getUsuariosActivos(), 1500, "Canales digitales", hoy));

        for (IndicadorDashboard indicador : indicadores) {
            indicador.setAnalisisFinanciero(analisisFinanciero);
            analisisFinanciero.getIndicadorDashboardList().add(indicador);
        }

        // ============================================================
        // 8. SALIDA PROFESIONAL EN CONSOLA
        // ============================================================
        imprimirEncabezado();

        imprimirSeccion("1. DATOS GENERALES DE LA ASEGURADORA");
        System.out.println("Empresa/Sucursal: " + sucursal.getNombreSucursal());
        System.out.println("Ciudad: " + sucursal.getCiudad());
        System.out.println("Gerente: " + sucursal.getGerente());
        System.out.println("Estado de la sucursal: " + estadoTexto(sucursal.isEstado()));
        System.out.println("Empleados registrados en sucursal: " + sucursal.getEmpleadoList().size());
        System.out.println("Usuario interno activo: " + usuarioInterno.getUsername() + " | Rol: " + rolAnalista.getNombreRol());
        System.out.println("Permisos del rol: " + rolAnalista.getPermisoList().size());
        System.out.println("Ultimo evento en bitacora: " + bitacora.getAccion() + " | Modulo: " + bitacora.getModulo());

        imprimirSeccion("2. CLIENTE, AGENTE Y POLIZAS CONTRATADAS");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        System.out.println("Codigo de cliente: " + cliente.getCodigoCliente());
        System.out.println("Tipo de cliente: " + cliente.getTipoCliente());
        System.out.println("Nivel de riesgo: " + cliente.getNivelRiesgo());
        System.out.println("Score financiero: " + cliente.getScoreFinanciero() + "/100");
        System.out.println("Agente asignado: " + agente.getNombre() + " " + agente.getApellidos());
        System.out.println("Especialidad del agente: " + agente.getEspecialidad());
        System.out.println("Ventas realizadas por el agente: " + agente.getVentasRealizadas());
        System.out.println("Total de polizas del cliente: " + cliente.getPolizaList().size());
        imprimirPoliza(polizaVehicular);
        imprimirPoliza(polizaMedica);

        imprimirSeccion("3. GESTION FINANCIERA Y PAGOS");
        System.out.println("Factura emitida: " + factura.getNumeroFactura());
        System.out.println("Estado de factura: " + factura.getEstadoPago());
        System.out.println("Subtotal: $" + formato(factura.getSubtotal()));
        System.out.println("IVA: $" + formato(factura.getIva()));
        System.out.println("Total facturado: $" + formato(factura.getTotal()));
        System.out.println("Metodo de pago: " + metodoPago.getTipoMetodo() + " | Entidad: " + metodoPago.getEntidadBancaria());
        System.out.println("Transferencia: " + transferencia.getCodigoTransferencia() + " | Estado: " + transferencia.getEstadoTransferencia());
        System.out.println("Tarjeta registrada: " + pagoTarjeta.getTipoTarjeta() + " | Banco emisor: " + pagoTarjeta.getBancoEmisor());
        System.out.println("Pago efectivo disponible en caja: " + pagoEfectivo.getCajaSucursal() + " | Recibo: " + pagoEfectivo.getCodigoRecibo());
        System.out.println("Historial de pago: " + historialPago.getEstadoFinanciero());
        System.out.println("Total pagado historico: $" + formato(historialPago.getTotalPagado()));
        System.out.println("Pagos pendientes: " + historialPago.getPagosPendientes());
        System.out.println("Mora acumulada: $" + formato(historialPago.getMoraAcumulada()));

        imprimirSeccion("4. SINIESTRO, RECLAMO E INSPECCION AUTOMATIZADA");
        System.out.println("Siniestro reportado: " + siniestro.getTipoSiniestro());
        System.out.println("Ubicacion: " + siniestro.getUbicacion());
        System.out.println("Monto estimado del siniestro: $" + formato(siniestro.getMontoEstimado()));
        System.out.println("Reclamo: " + reclamo.getNumeroReclamo() + " | Estado: " + reclamo.getEstado());
        System.out.println("Tipo de reclamo: " + reclamo.getTipoReclamo());
        System.out.println("Monto solicitado: $" + formato(reclamo.getMontoSolicitado()));
        System.out.println("Nivel de riesgo del reclamo: " + reclamo.getNivelRiesgo());
        System.out.println("Fraude detectado: " + (reclamo.isFraudeDetectado() ? "Si" : "No"));
        System.out.println("Documentos cargados: " + reclamo.getDocumentoList().size());
        for (Documento documento : reclamo.getDocumentoList()) {
            System.out.println("   - " + documento.getNombreArchivo() + " | Tipo: " + documento.getTipoDocumento() + " | Estado: " + documento.getEstadoValidacion());
        }
        System.out.println("Inspeccion IA: " + inspeccion.getTipoAnalisis());
        System.out.println("Resultado IA: " + inspeccion.getResultadoIA());
        System.out.println("Porcentaje de dano detectado: " + inspeccion.getPorcentajeDanio() + "%");

        imprimirSeccion("5. TRANSFORMACION DIGITAL DEL SISTEMA");
        System.out.println("Portal de autogestion: " + portal.getUrlPortal());
        System.out.println("Usuarios activos en portal: " + portal.getUsuariosActivos());
        System.out.println("Chatbot de soporte: " + chatbot.getNombreBot() + " | Nivel IA: " + chatbot.getNivelIA());
        System.out.println("Usuario cliente digital: " + usuarioCliente.getUsername() + " | Dispositivo: " + usuarioCliente.getDispositivoAcceso());
        System.out.println("Contrato inteligente: " + contratoInteligente.getCodigoContrato() + " | Estado: " + contratoInteligente.getEstado());
        System.out.println("Condicion digital: " + contratoInteligente.getCondiciones());
        System.out.println("Procesos digitales modelados: " + procesosDigitales.size());
        for (ProcesoDigital proceso : procesosDigitales) {
            System.out.println("   - " + proceso.getNombreProceso() + " | Automatizacion: " + proceso.getNivelAutomatizacion() + " | Responsable: " + proceso.getResponsable());
        }

        imprimirSeccion("6. EVALUACION DE MADUREZ DIGITAL");
        System.out.println("Fecha de evaluacion: " + evaluacionMadurez.getFechaEvaluacion());
        System.out.println("Puntaje total de madurez: " + evaluacionMadurez.getPuntajeTotal() + "/100");
        System.out.println("Nivel registrado: " + evaluacionMadurez.getNivelMadurez());
        System.out.println("Nivel calculado por el Main: " + clasificarMadurez(evaluacionMadurez.getPuntajeTotal()));
        System.out.println("Porcentaje de digitalizacion: " + evaluacionMadurez.getPorcentajeDigitalizacion() + "%");
        System.out.println("Procesos automatizados: " + evaluacionMadurez.getProcesosAutomatizados());
        System.out.println("Descripcion del nivel: " + nivelMadurez.getDescripcion());
        System.out.println("Observacion: " + evaluacionMadurez.getObservaciones());
        System.out.println("Areas evaluadas:");
        for (AreaEmpresa area : areas) {
            System.out.println("   - " + area.getNombreArea() + " | Nivel digital: " + area.getNivelDigitalizacion() + " | Responsable: " + area.getResponsable());
        }
        System.out.println("Recomendaciones digitales:");
        for (RecomendacionDigital recomendacion : evaluacionMadurez.getRecomendacionDigitalList()) {
            System.out.println("   - [" + recomendacion.getPrioridad() + "] " + recomendacion.getDescripcion());
            System.out.println("     Impacto esperado: " + recomendacion.getImpactoEsperado());
        }

        imprimirSeccion("7. VALIDACION ANTIFRAUDE Y ANALISIS FINANCIERO");
        System.out.println("Validacion aplicada: " + validacionFraude.getTipoValidacion());
        System.out.println("Nivel de sospecha: " + validacionFraude.getNivelSospecha());
        System.out.println("Resultado: " + validacionFraude.getResultado());
        System.out.println("Probabilidad de fraude: " + validacionFraude.getPorcentajeFraude() + "%");
        System.out.println("Alertas generadas: " + validacionFraude.getAlertaFraudeList().size());
        for (AlertaFraude alerta : validacionFraude.getAlertaFraudeList()) {
            System.out.println("   - " + alerta.getTipoAlerta() + " | Criticidad: " + alerta.getNivelCriticidad() + " | Accion: " + alerta.getAccionTomada());
        }
        System.out.println("Monto de perdidas analizado: $" + formato(analisisFinanciero.getMontoPerdidas()));
        System.out.println("Monto recuperado: $" + formato(analisisFinanciero.getMontoRecuperado()));
        System.out.println("Indice de fraude financiero: " + analisisFinanciero.getIndiceFraude() + "%");
        System.out.println("Riesgo financiero: " + analisisFinanciero.getRiesgoFinanciero());

        imprimirSeccion("8. INDICADORES PARA FUTURO DASHBOARD");
        for (IndicadorDashboard indicador : indicadores) {
            imprimirIndicador(indicador);
        }

        imprimirSeccion("9. RESUMEN FINAL DEL MODELO ORIENTADO A OBJETOS");
        System.out.println("Clases de negocio evidenciadas: Cliente, Agente, Seguro, Poliza, Cobertura, Siniestro, Reclamo, Pago, Factura.");
        System.out.println("Clases digitales evidenciadas: PortalAutogestion, ChatbotSoporte, ProcesoDigital, EvaluacionMadurez, IndicadorDashboard, ValidacionFraude.");
        System.out.println("Relaciones demostradas:");
        System.out.println("   - Cliente tiene varias polizas: " + cliente.getPolizaList().size());
        System.out.println("   - Agente gestiona varias polizas: " + agente.getPolizaList().size());
        System.out.println("   - Poliza vehicular contiene cobertura: " + polizaVehicular.getCobertura().getNombreCobertura());
        System.out.println("   - Reclamo contiene documentos: " + reclamo.getDocumentoList().size());
        System.out.println("   - Reclamo se conecta con siniestro, inspeccion IA, fraude y analisis financiero.");
        System.out.println("   - Evaluacion de madurez se conecta con areas y recomendaciones digitales.");
        System.out.println("Conclusion: el sistema no solo administra seguros; tambien permite medir digitalizacion, automatizacion, riesgos e indicadores para un dashboard futuro.");
        imprimirLinea();
    }

    private static void imprimirEncabezado() {
        imprimirLinea();
        System.out.println("SISTEMA INTELIGENTE DE GESTION DE SEGUROS");
        System.out.println("Proyecto Integrador POO Java - Aseguradora Sucre Cuenca");
        System.out.println("Modelo empresarial con transformacion digital, madurez digital e indicadores");
        imprimirLinea();
    }

    private static void imprimirSeccion(String titulo) {
        System.out.println();
        imprimirLinea();
        System.out.println(titulo);
        imprimirLinea();
    }

    private static void imprimirLinea() {
        System.out.println("============================================================");
    }

    private static void imprimirPoliza(Poliza poliza) {
        System.out.println("   - Poliza: " + poliza.getNumeroPoliza()
                + " | Tipo: " + poliza.getTipoPoliza()
                + " | Estado: " + poliza.getEstadoPoliza()
                + " | Prima mensual: $" + formato(poliza.getPrimaMensual())
                + " | Vigencia: " + poliza.getFechaInicio() + " a " + poliza.getFechaFin());
    }

    private static void imprimirIndicador(IndicadorDashboard indicador) {
        double cumplimiento = calcularCumplimiento(indicador.getValorActual(), indicador.getMeta());
        System.out.println("Indicador: " + indicador.getNombreIndicador());
        System.out.println("   Categoria: " + indicador.getCategoria());
        System.out.println("   Descripcion: " + indicador.getDescripcion());
        System.out.println("   Valor actual: " + formato(indicador.getValorActual()) + " | Meta: " + formato(indicador.getMeta()));
        if (indicador.getMeta() > 0) {
            System.out.println("   Cumplimiento estimado: " + formato(cumplimiento) + "% | Estado: " + interpretarCumplimiento(cumplimiento));
        } else {
            System.out.println("   Cumplimiento estimado: requiere control inmediato porque la meta es 0.");
        }
    }

    private static int contarProcesosActivos(List<ProcesoDigital> procesos) {
        int total = 0;
        for (ProcesoDigital proceso : procesos) {
            if (proceso.isEstado()) {
                total++;
            }
        }
        return total;
    }

    private static double calcularCumplimiento(double valorActual, double meta) {
        if (meta == 0) {
            return 0;
        }
        return (valorActual / meta) * 100;
    }

    private static String interpretarCumplimiento(double cumplimiento) {
        if (cumplimiento >= 90) {
            return "Excelente";
        } else if (cumplimiento >= 70) {
            return "Bueno";
        } else if (cumplimiento >= 50) {
            return "En proceso";
        } else {
            return "Requiere mejora";
        }
    }

    private static String clasificarMadurez(double puntaje) {
        if (puntaje >= 85) {
            return "Alto";
        } else if (puntaje >= 70) {
            return "Medio - Alto";
        } else if (puntaje >= 50) {
            return "Medio";
        } else {
            return "Bajo";
        }
    }

    private static String estadoTexto(boolean estado) {
        return estado ? "Activo" : "Inactivo";
    }

    private static String formato(double valor) {
        return String.format("%.2f", valor);
    }
}
