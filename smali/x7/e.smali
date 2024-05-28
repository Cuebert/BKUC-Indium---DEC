.class public Lx7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lx7/e;


# instance fields
.field private final a:Z

.field private final b:Lc9/r;

.field private c:J

.field private d:Le8/f;


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 4
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    .line 5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->B()I

    move-result v2

    int-to-double v2, v2

    cmpg-double v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lc9/s;

    invoke-direct {v1}, Lc9/s;-><init>()V

    .line 6
    invoke-direct {p0, v0, v1}, Lx7/e;-><init>(ZLc9/r;)V

    return-void
.end method

.method constructor <init>(ZLc9/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lx7/e;->a:Z

    .line 3
    iput-object p2, p0, Lx7/e;->b:Lc9/r;

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    const-string v0, "sessionCheck"

    invoke-static {p0, v0}, Lcom/roblox/client/f0;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(I)V
    .locals 1

    const-string p0, "Android-AppSignup-Success"

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lx7/e;->p(Ljava/lang/String;I)V

    return-void
.end method

.method public static h()Lx7/e;
    .locals 2

    .line 1
    sget-object v0, Lx7/e;->e:Lx7/e;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    const-class v0, Lx7/e;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lx7/e;->e:Lx7/e;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Lx7/e;

    invoke-direct {v1}, Lx7/e;-><init>()V

    sput-object v1, Lx7/e;->e:Lx7/e;

    .line 5
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    sget-object v0, Lx7/e;->e:Lx7/e;

    return-object v0

    :catchall_0
    move-exception v1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static i(Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "Quest-ROBLOXPlayer-Session-Inferred-Crash"

    goto :goto_0

    :cond_0
    const-string p0, "Quest-ROBLOXPlayer-Session-Inferred-Success"

    :goto_0
    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    const-string p0, "Android-ROBLOXPlayer-Session-Inferred-Crash"

    goto :goto_1

    :cond_2
    const-string p0, "Android-ROBLOXPlayer-Session-Inferred-Success"

    :goto_1
    return-object p0
.end method

.method static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\\."

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 2
    array-length v0, p0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    .line 3
    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const-string p0, "Unknown"

    .line 4
    :goto_0
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Quest-AppStartup-Version-"

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {}, Lc9/l;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Amazon-AppStartup-Version-"

    goto :goto_1

    :cond_2
    const-string v0, "Android-AppStartup-Version-"

    .line 6
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static k(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    const-string v0, "\\."

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 2
    array-length v0, p0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    .line 3
    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const-string p0, "Unknown"

    .line 4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_1

    const-string p1, "Amazon-AppStartup-Version-"

    goto :goto_1

    :cond_1
    const-string p1, "Android-AppStartup-Version-"

    .line 5
    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Quest-AppStartup-Version-Total"

    return-object v0

    .line 2
    :cond_0
    invoke-static {}, Lc9/l;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Amazon-AppStartup-Version-Total"

    return-object v0

    :cond_1
    const-string v0, "Android-AppStartup-Version-Total"

    return-object v0
.end method

.method private static o(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lx7/e;->p(Ljava/lang/String;I)V

    return-void
.end method

.method private static p(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Lh7/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roblox/client/p0;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Lcom/roblox/client/p0;->w(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lh7/q;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lh7/q;->c()V

    return-void
.end method

.method private r(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 2

    .line 1
    new-instance v0, Ln7/a;

    const-string v1, "Android2StepVerificationFailure"

    invoke-direct {v0, v1}, Ln7/a;-><init>(Ljava/lang/String;)V

    const-string v1, "Status"

    .line 2
    invoke-virtual {v0, v1, p1}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string v0, "requestUrl"

    .line 3
    invoke-virtual {p1, v0, p3}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p3, "httpResponseCode"

    .line 4
    invoke-virtual {p1, p3, p2}, Ln7/a;->c(Ljava/lang/String;I)Ln7/a;

    move-result-object p1

    const-string p2, "responseBody"

    .line 5
    invoke-virtual {p1, p2, p4}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "username"

    .line 6
    invoke-virtual {p1, p2, p5}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "responseTimeMs"

    .line 7
    invoke-virtual {p1, p2, p6, p7}, Ln7/a;->d(Ljava/lang/String;J)Ln7/a;

    move-result-object p1

    const-wide/16 p2, 0x0

    cmp-long p4, p8, p2

    if-ltz p4, :cond_0

    const-string p2, "timeSinceLastLoginMs"

    .line 8
    invoke-virtual {p1, p2, p8, p9}, Ln7/a;->d(Ljava/lang/String;J)Ln7/a;

    .line 9
    :cond_0
    invoke-virtual {p1}, Ln7/a;->h()Lw6/c;

    return-void
.end method

.method private s(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ln7/a;

    invoke-direct {v0, p1}, Ln7/a;-><init>(Ljava/lang/String;)V

    const-string p1, "Status"

    .line 2
    invoke-virtual {v0, p1, p2}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "requestUrl"

    .line 3
    invoke-virtual {p1, p2, p4}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "responseBody"

    .line 4
    invoke-virtual {p1, p2, p5}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "username"

    .line 5
    invoke-virtual {p1, p2, p6}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    const-string p2, "responseTimeMs"

    .line 6
    invoke-virtual {p1, p2, p7, p8}, Ln7/a;->d(Ljava/lang/String;J)Ln7/a;

    move-result-object p1

    const-string p2, "httpResponseCode"

    .line 7
    invoke-virtual {p1, p2, p3}, Ln7/a;->c(Ljava/lang/String;I)Ln7/a;

    move-result-object p1

    const-string p2, "signupType"

    .line 8
    invoke-virtual {p1, p2, p9}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ln7/a;->h()Lw6/c;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lx7/e;->p(Ljava/lang/String;I)V

    return-void
.end method

.method public B(Ljava/lang/String;J)V
    .locals 3

    .line 1
    new-instance v0, Lh7/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {p1, p2, p3}, Lcom/roblox/client/p0;->y(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lh7/q;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Lh7/q;->c()V

    .line 5
    iget-boolean v0, p0, Lx7/e;->a:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lx7/e;->C(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public C(Ljava/lang/String;J)V
    .locals 1

    long-to-double p2, p2

    const-string v0, "Mobile"

    invoke-static {v0, p1, p2, p3}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReportToDiagByCountryCode(Ljava/lang/String;Ljava/lang/String;D)V

    return-void
.end method

.method public D()V
    .locals 1

    const-string v0, "Android-Payments-Incorrect-User-Purchase"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public E()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Request"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public F()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-200"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public G()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-400"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public H()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-401"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public I()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-403"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public J()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-404"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public K()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-429"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public L()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-500"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public M()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-503"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public N()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Precheck-Response-Unknown"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public O()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Request"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public P()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Response-200"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public Q()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Response-400"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public R()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Response-401"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public S()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Response-500"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public T()V
    .locals 1

    const-string v0, "Android-Payments-Api-V1-Verify-Response-Unknown"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public U()V
    .locals 1

    const-string v0, "Android-Payments-Pending-Purchase"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public V(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckBalanceError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckBalanceError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckBalanceError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckBalanceError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public W(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public X(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckProductDetailsNotSupported-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckProductDetailsNotSupported-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public Y(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckRetry-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckRetry-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckRetry-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckRetry-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public Z(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PrecheckUnknownError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PrecheckUnknownError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PrecheckUnknownError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PrecheckUnknownError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lh7/j;)V
    .locals 10

    .line 1
    invoke-virtual {p3}, Lh7/j;->b()I

    move-result v2

    const-string v0, "Android-App2SV-Failure"

    .line 2
    invoke-static {v0}, Lx7/e;->o(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p3}, Lh7/j;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p3}, Lh7/j;->c()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    .line 5
    invoke-direct/range {v0 .. v9}, Lx7/e;->r(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method

.method public a0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PurchaseAlreadyAcknowledged-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PurchaseAlreadyAcknowledged-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public b(I)V
    .locals 0

    const-string p1, "Android-App2SV-Success"

    invoke-static {p1}, Lx7/e;->o(Ljava/lang/String;)V

    return-void
.end method

.method public b0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseCancelled-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PurchaseCancelled-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PurchaseCancelled-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PurchaseCancelled-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    const-string p1, "Android-AppLogin-Failure"

    .line 1
    invoke-static {p1}, Lx7/e;->o(Ljava/lang/String;)V

    .line 2
    invoke-static {p2}, Lx7/e;->o(Ljava/lang/String;)V

    return-void
.end method

.method public c0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseFailed-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PurchaseFailed-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PurchaseFailed-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PurchaseFailed-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 1

    const-string v0, "Android-AppLogin-Success"

    invoke-static {v0}, Lx7/e;->o(Ljava/lang/String;)V

    return-void
.end method

.method public d0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseFlooded-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PurchaseFlooded-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PurchaseFlooded-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PurchaseFlooded-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public e0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-PurchaseSuccess-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-PurchaseSuccess-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-PurchaseSuccess-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-PurchaseSuccess-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 11

    .line 1
    invoke-static {p1}, Lx7/e;->o(Ljava/lang/String;)V

    const-string v0, "Android-AppSignup-Failure"

    .line 2
    invoke-static {v0}, Lx7/e;->o(Ljava/lang/String;)V

    const-string v2, "SignupFailureAndroid"

    const-string v10, "regular"

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    .line 3
    invoke-direct/range {v1 .. v10}, Lx7/e;->s(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public f0()V
    .locals 1

    const-string v0, "Android-Payments-Unacknowledged-Purchase-Failure"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public g0()V
    .locals 1

    const-string v0, "Android-Payments-Unknown-State-Purchase"

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public h0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationEmptyError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-VerificationEmptyError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-VerificationEmptyError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-VerificationEmptyError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public i0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-VerificationError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-VerificationError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-VerificationError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public j0(ZZ)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Amazon-Payments-VerificationUnknownError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-VerificationUnknownError-InApp"

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    const-string p1, "Amazon-Payments-VerificationUnknownError-InGame"

    goto :goto_0

    :cond_2
    const-string p1, "Android-Payments-VerificationUnknownError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public k0(Le8/f;)V
    .locals 0

    iput-object p1, p0, Lx7/e;->d:Le8/f;

    return-void
.end method

.method public l0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lx7/e;->b:Lc9/r;

    invoke-interface {v0}, Lc9/r;->b()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lx7/e;->c:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-eqz v8, :cond_0

    const-wide/32 v2, 0x36ee80

    cmp-long v6, v4, v2

    if-ltz v6, :cond_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lx7/e;->n()V

    .line 4
    iput-wide v0, p0, Lx7/e;->c:J

    :cond_1
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    .line 2
    invoke-static {}, Lc9/l;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Mobile-DownloadCount-Amazon"

    goto :goto_0

    :cond_0
    const-string v1, "Mobile-DownloadCount-Android"

    .line 3
    :goto_0
    invoke-virtual {v0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method n()V
    .locals 3

    .line 1
    invoke-static {}, Lc9/l;->d()Z

    move-result v0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->f1()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lx7/e;->k(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->X()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-static {}, Lx7/e;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->f1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx7/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    const-string v0, "Amazon-AppStartup-Version-Total"

    goto :goto_0

    :cond_1
    const-string v0, "Android-AppStartup-Version-Total"

    .line 6
    :goto_0
    invoke-virtual {p0, v0}, Lx7/e;->A(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public q(Z)V
    .locals 3

    .line 1
    new-instance v0, Ln7/a;

    const-string v1, "Android-RobloxPlayer-SessionReport-Inferred"

    invoke-direct {v0, v1}, Ln7/a;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string v1, "Crash"

    goto :goto_0

    :cond_0
    const-string v1, "Success"

    :goto_0
    const-string v2, "Session"

    .line 2
    invoke-virtual {v0, v2, v1}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ln7/a;->h()Lw6/c;

    .line 4
    invoke-static {p1}, Lx7/e;->i(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public t(Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx7/c;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public u(Landroid/content/Context;J)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lx7/c;->e(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 3

    const-string v0, "rbx.purchaseflow"

    .line 1
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lx7/e;->d:Le8/f;

    if-eqz v0, :cond_0

    .line 3
    iget v1, v0, Le8/f;->d:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Le8/f;->d:I

    .line 4
    new-instance v0, Ln7/a;

    const-string v1, "Android-PurchaseFlow"

    invoke-direct {v0, v1}, Ln7/a;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v2}, Ln7/a;->n(Z)Ln7/a;

    move-result-object v0

    iget-object v1, p0, Lx7/e;->d:Le8/f;

    iget-object v1, v1, Le8/f;->a:Ljava/lang/String;

    const-string v2, "Username"

    .line 6
    invoke-virtual {v0, v2, v1}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object v0

    iget-object v1, p0, Lx7/e;->d:Le8/f;

    iget-boolean v1, v1, Le8/f;->c:Z

    const-string v2, "InAppPurchase"

    .line 7
    invoke-virtual {v0, v2, v1}, Ln7/a;->f(Ljava/lang/String;Z)Ln7/a;

    move-result-object v0

    iget-object v1, p0, Lx7/e;->d:Le8/f;

    iget-object v1, v1, Le8/f;->b:Ljava/lang/String;

    const-string v2, "ProductId"

    .line 8
    invoke-virtual {v0, v2, v1}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lx7/e;->d:Le8/f;

    iget v2, v2, Le8/f;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Message"

    .line 9
    invoke-virtual {v0, v1, p1}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    .line 10
    invoke-static {}, Lcom/roblox/client/l;->g()Lcom/roblox/client/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/l;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "Rooted"

    invoke-virtual {p1, v1, v0}, Ln7/a;->g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ln7/a;->h()Lw6/c;

    :cond_0
    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 8

    .line 1
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/n;->d()Lx7/c;

    move-result-object v1

    .line 2
    invoke-static {}, Lc9/l;->d()Z

    move-result v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    .line 3
    invoke-virtual/range {v1 .. v7}, Lx7/c;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public x(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-AcknowledgeError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-AcknowledgeError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public y(Ljava/lang/String;IZ)V
    .locals 3

    const/16 v0, 0xc

    if-eq p2, v0, :cond_0

    packed-switch p2, :pswitch_data_0

    const-string p2, "UnknownBillingResponseCode"

    goto :goto_0

    :pswitch_0
    const-string p2, "ItemNotOwned"

    goto :goto_0

    :pswitch_1
    const-string p2, "ItemAlreadyOwned"

    goto :goto_0

    :pswitch_2
    const-string p2, "Error"

    goto :goto_0

    :pswitch_3
    const-string p2, "DeveloperError"

    goto :goto_0

    :pswitch_4
    const-string p2, "ItemUnavailable"

    goto :goto_0

    :pswitch_5
    const-string p2, "BillingUnavailable"

    goto :goto_0

    :pswitch_6
    const-string p2, "ServiceUnavailable"

    goto :goto_0

    :pswitch_7
    const-string p2, "UserCancelled"

    goto :goto_0

    :pswitch_8
    const-string p2, "Ok"

    goto :goto_0

    :pswitch_9
    const-string p2, "ServiceDisconnected"

    goto :goto_0

    :pswitch_a
    const-string p2, "FeatureNotSupported"

    goto :goto_0

    :pswitch_b
    const-string p2, "ServiceTimeout"

    goto :goto_0

    :cond_0
    const-string p2, "NetworkError"

    :goto_0
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Android-Payments"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 p1, 0x2

    aput-object p2, v0, p1

    const/4 p1, 0x3

    if-eqz p3, :cond_1

    const-string p2, "InApp"

    goto :goto_1

    :cond_1
    const-string p2, "InGame"

    :goto_1
    aput-object p2, v0, p1

    const-string p1, "-"

    .line 1
    invoke-static {p1, v0}, Lc9/q;->d(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public z(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Android-Payments-ConsumeError-InApp"

    goto :goto_0

    :cond_0
    const-string p1, "Android-Payments-ConsumeError-InGame"

    :goto_0
    invoke-virtual {p0, p1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method
