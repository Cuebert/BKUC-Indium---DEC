.class Lcom/android/billingclient/api/d;
.super Lcom/android/billingclient/api/c;
.source "SourceFile"


# instance fields
.field private volatile a:I

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/Handler;

.field private volatile d:Lcom/android/billingclient/api/a0;

.field private e:Landroid/content/Context;

.field private f:Lcom/android/billingclient/api/n;

.field private volatile g:Lcom/google/android/gms/internal/play_billing/b3;

.field private volatile h:Lcom/android/billingclient/api/l;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Lcom/android/billingclient/api/s;

.field private y:Z

.field private z:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/s;Ln1/j;Ljava/lang/String;Ljava/lang/String;Ln1/c;Lcom/android/billingclient/api/n;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/android/billingclient/api/c;-><init>()V

    const/4 p5, 0x0

    iput p5, p0, Lcom/android/billingclient/api/d;->a:I

    new-instance p7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p7, p0, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    iput p5, p0, Lcom/android/billingclient/api/d;->k:I

    iput-object p4, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move-object v5, p6

    move-object v6, p4

    .line 2
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/d;->k(Landroid/content/Context;Ln1/j;Lcom/android/billingclient/api/s;Ln1/c;Ljava/lang/String;Lcom/android/billingclient/api/n;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/s;Landroid/content/Context;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;)V
    .locals 8

    .line 13
    invoke-static {}, Lcom/android/billingclient/api/d;->B()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v2, p2

    move-object v3, p4

    move-object v6, p5

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/d;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/s;Ln1/j;Ljava/lang/String;Ljava/lang/String;Ln1/c;Lcom/android/billingclient/api/n;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/s;Landroid/content/Context;Ln1/z;Lcom/android/billingclient/api/n;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/android/billingclient/api/c;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/d;->a:I

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/d;->k:I

    .line 4
    invoke-static {}, Lcom/android/billingclient/api/d;->B()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o4;->w()Lcom/google/android/gms/internal/play_billing/n4;

    move-result-object p1

    .line 7
    invoke-static {}, Lcom/android/billingclient/api/d;->B()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/n4;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/n4;

    iget-object p3, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 8
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/n4;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/n4;

    iget-object p3, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/o4;

    new-instance p4, Lcom/android/billingclient/api/p;

    .line 10
    invoke-direct {p4, p3, p1}, Lcom/android/billingclient/api/p;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/o4;)V

    iput-object p4, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const-string p1, "BillingClient"

    const-string p3, "Billing client should have a valid listener but the provided is null."

    .line 11
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/a0;

    iget-object p3, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    iget-object p4, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 p5, 0x0

    .line 12
    invoke-direct {p1, p3, p5, p4}, Lcom/android/billingclient/api/a0;-><init>(Landroid/content/Context;Ln1/z;Lcom/android/billingclient/api/n;)V

    iput-object p1, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    iput-object p2, p0, Lcom/android/billingclient/api/d;->x:Lcom/android/billingclient/api/s;

    return-void
.end method

.method private final A()Lcom/android/billingclient/api/f;
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/billingclient/api/d;->a:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/android/billingclient/api/d;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    sget-object v0, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    :goto_1
    return-object v0
.end method

.method private static B()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "VERSION_NAME"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "6.0.1"

    return-object v0
.end method

.method private final C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->z:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/b0;->a:I

    new-instance v1, Lcom/android/billingclient/api/i;

    invoke-direct {v1, p0}, Lcom/android/billingclient/api/i;-><init>(Lcom/android/billingclient/api/d;)V

    .line 2
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/d;->z:Ljava/util/concurrent/ExecutorService;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/d;->z:Ljava/util/concurrent/ExecutorService;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p2, p2

    new-instance v0, Ln1/p0;

    invoke-direct {v0, p1, p4}, Ln1/p0;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    const-wide v1, 0x3fee666666666666L    # 0.95

    mul-double p2, p2, v1

    double-to-long p2, p2

    .line 4
    invoke-virtual {p5, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Async task throws exception!"

    .line 5
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final D(Ljava/lang/String;Ln1/h;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v0, 0x2

    .line 2
    sget-object v3, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v0, v2, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 4
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 5
    invoke-interface {p2, v3, v1}, Ln1/h;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_0
    new-instance v5, Lcom/android/billingclient/api/n0;

    invoke-direct {v5, p0, p1, p2}, Lcom/android/billingclient/api/n0;-><init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ln1/h;)V

    const-wide/16 v6, 0x7530

    new-instance v8, Lcom/android/billingclient/api/f0;

    invoke-direct {v8, p0, p2}, Lcom/android/billingclient/api/f0;-><init>(Lcom/android/billingclient/api/d;Ln1/h;)V

    .line 6
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object v9

    move-object v4, p0

    .line 7
    invoke-direct/range {v4 .. v9}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_1

    .line 8
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object p1

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v3, 0x19

    .line 9
    invoke-static {v3, v2, p1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 10
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 11
    invoke-interface {p2, p1, v1}, Ln1/h;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private final E(Ljava/lang/String;Ln1/i;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/16 v1, 0x9

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v0, 0x2

    .line 2
    sget-object v2, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 4
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p1

    .line 6
    invoke-interface {p2, v2, p1}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    .line 7
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid product type."

    .line 8
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v0, 0x32

    .line 9
    sget-object v2, Lcom/android/billingclient/api/o;->g:Lcom/android/billingclient/api/f;

    .line 10
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object p1

    .line 13
    invoke-interface {p2, v2, p1}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_1
    new-instance v4, Lcom/android/billingclient/api/m0;

    invoke-direct {v4, p0, p1, p2}, Lcom/android/billingclient/api/m0;-><init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ln1/i;)V

    const-wide/16 v5, 0x7530

    new-instance v7, Lcom/android/billingclient/api/k0;

    invoke-direct {v7, p0, p2}, Lcom/android/billingclient/api/k0;-><init>(Lcom/android/billingclient/api/d;Ln1/i;)V

    .line 14
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object v8

    move-object v3, p0

    .line 15
    invoke-direct/range {v3 .. v8}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    .line 16
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object p1

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x19

    .line 17
    invoke-static {v2, v1, p1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 18
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method private final F(Lcom/android/billingclient/api/f;II)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    const/4 v1, 0x5

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d4;->x()Lcom/google/android/gms/internal/play_billing/c4;

    move-result-object v2

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l4;->w()Lcom/google/android/gms/internal/play_billing/j4;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v4

    .line 3
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/play_billing/j4;->o(I)Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->a()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/play_billing/j4;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/j4;

    .line 5
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/play_billing/j4;->p(I)Lcom/google/android/gms/internal/play_billing/j4;

    .line 6
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/c4;->n(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/c4;

    .line 7
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/c4;->p(I)Lcom/google/android/gms/internal/play_billing/c4;

    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w4;->w()Lcom/google/android/gms/internal/play_billing/u4;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/u4;->n(I)Lcom/google/android/gms/internal/play_billing/u4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/w4;

    .line 9
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/play_billing/c4;->o(Lcom/google/android/gms/internal/play_billing/w4;)Lcom/google/android/gms/internal/play_billing/c4;

    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/d4;

    .line 11
    invoke-interface {v0, p1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h4;->w()Lcom/google/android/gms/internal/play_billing/g4;

    move-result-object p2

    .line 13
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/play_billing/g4;->o(I)Lcom/google/android/gms/internal/play_billing/g4;

    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w4;->w()Lcom/google/android/gms/internal/play_billing/u4;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/play_billing/u4;->n(I)Lcom/google/android/gms/internal/play_billing/u4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/play_billing/w4;

    .line 15
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/g4;->n(Lcom/google/android/gms/internal/play_billing/w4;)Lcom/google/android/gms/internal/play_billing/g4;

    .line 16
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h4;

    .line 17
    invoke-interface {p1, p2}, Lcom/android/billingclient/api/n;->a(Lcom/google/android/gms/internal/play_billing/h4;)V

    return-void
.end method

.method static bridge synthetic G(Lcom/android/billingclient/api/d;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/d;->k:I

    return p0
.end method

.method static bridge synthetic H(Lcom/android/billingclient/api/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic K(Lcom/android/billingclient/api/d;)Landroid/os/Handler;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method static synthetic L(Lcom/android/billingclient/api/d;Ljava/lang/String;)Lcom/android/billingclient/api/m;
    .locals 17

    move-object/from16 v1, p0

    .line 1
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Querying purchase history, item type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "BillingClient"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    .line 2
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v3, v1, Lcom/android/billingclient/api/d;->n:Z

    iget-boolean v4, v1, Lcom/android/billingclient/api/d;->v:Z

    iget-object v5, v1, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 3
    invoke-static {v3, v4, v6, v7, v5}, Lcom/google/android/gms/internal/play_billing/b0;->c(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    move-object v12, v4

    :goto_0
    iget-boolean v5, v1, Lcom/android/billingclient/api/d;->l:Z

    if-nez v5, :cond_0

    const-string v0, "getPurchaseHistory is not supported on current device"

    .line 4
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/m;

    .line 5
    sget-object v1, Lcom/android/billingclient/api/o;->q:Lcom/android/billingclient/api/f;

    invoke-direct {v0, v1, v4}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_0
    const/16 v5, 0xb

    :try_start_0
    iget-object v8, v1, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    const/4 v9, 0x6

    iget-object v10, v1, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 6
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    move-object v13, v3

    .line 7
    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/b3;->M(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v8
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v9, "getPurchaseHistory()"

    .line 8
    invoke-static {v8, v2, v9}, Lcom/android/billingclient/api/y;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/x;->a()Lcom/android/billingclient/api/f;

    move-result-object v10

    .line 9
    sget-object v11, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    if-eq v10, v11, :cond_1

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    invoke-virtual {v9}, Lcom/android/billingclient/api/x;->b()I

    move-result v1

    .line 10
    invoke-static {v1, v5, v10}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Lcom/android/billingclient/api/m;

    invoke-direct {v0, v10, v4}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_1
    const-string v9, "INAPP_PURCHASE_ITEM_LIST"

    .line 12
    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string v10, "INAPP_PURCHASE_DATA_LIST"

    .line 13
    invoke-virtual {v8, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    const-string v11, "INAPP_DATA_SIGNATURE_LIST"

    .line 14
    invoke-virtual {v8, v11}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 15
    :goto_1
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v12, v14, :cond_3

    .line 16
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 17
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 18
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Purchase record found for sku : "

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-static {v2, v6}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v6, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 20
    invoke-direct {v6, v14, v15}, Lcom/android/billingclient/api/PurchaseHistoryRecord;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    invoke-virtual {v6}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "BUG: empty/null token!"

    .line 22
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v13, 0x1

    .line 23
    :cond_2
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v3, "Got an exception trying to decode the purchase!"

    .line 24
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x33

    sget-object v2, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 25
    invoke-static {v1, v5, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Lcom/android/billingclient/api/m;

    invoke-direct {v0, v2, v4}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto :goto_2

    :cond_3
    if-eqz v13, :cond_4

    .line 27
    iget-object v6, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v7, 0x1a

    sget-object v9, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 28
    invoke-static {v7, v5, v9}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v5

    .line 29
    invoke-interface {v6, v5}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    :cond_4
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    .line 30
    invoke-virtual {v8, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Continuation token: "

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v1, Lcom/android/billingclient/api/m;

    sget-object v2, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    invoke-direct {v1, v2, v0}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    move-object v0, v1

    goto :goto_2

    :cond_5
    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    const-string v3, "Got exception trying to get purchase history, try to reconnect"

    .line 33
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x3b

    .line 34
    sget-object v2, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 35
    invoke-static {v1, v5, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 36
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Lcom/android/billingclient/api/m;

    invoke-direct {v0, v2, v4}, Lcom/android/billingclient/api/m;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :goto_2
    return-object v0
.end method

.method static bridge synthetic M(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/n;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    return-object p0
.end method

.method static bridge synthetic N(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/f;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic O(Lcom/android/billingclient/api/d;)Lcom/google/android/gms/internal/play_billing/b3;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    return-object p0
.end method

.method static bridge synthetic S(Lcom/android/billingclient/api/d;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 6

    const-wide/16 v2, 0x7530

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic T(Lcom/android/billingclient/api/d;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/d;->a:I

    return-void
.end method

.method static bridge synthetic U(Lcom/android/billingclient/api/d;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/d;->k:I

    return-void
.end method

.method static bridge synthetic V(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->o:Z

    return-void
.end method

.method static bridge synthetic W(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->p:Z

    return-void
.end method

.method static bridge synthetic X(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->q:Z

    return-void
.end method

.method static bridge synthetic Y(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->r:Z

    return-void
.end method

.method static bridge synthetic Z(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->s:Z

    return-void
.end method

.method static bridge synthetic a0(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->t:Z

    return-void
.end method

.method static bridge synthetic b0(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->u:Z

    return-void
.end method

.method static bridge synthetic c0(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->v:Z

    return-void
.end method

.method static bridge synthetic d0(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->w:Z

    return-void
.end method

.method private k(Landroid/content/Context;Ln1/j;Lcom/android/billingclient/api/s;Ln1/c;Ljava/lang/String;Lcom/android/billingclient/api/n;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o4;->w()Lcom/google/android/gms/internal/play_billing/n4;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/n4;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/n4;

    iget-object p5, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 4
    invoke-virtual {p5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/n4;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/n4;

    if-eqz p6, :cond_0

    iput-object p6, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    goto :goto_0

    .line 5
    :cond_0
    iget-object p5, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/o4;

    new-instance p6, Lcom/android/billingclient/api/p;

    .line 7
    invoke-direct {p6, p5, p1}, Lcom/android/billingclient/api/p;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/o4;)V

    iput-object p6, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    :goto_0
    if-nez p2, :cond_1

    const-string p1, "BillingClient"

    const-string p5, "Billing client should have a valid listener but the provided is null."

    .line 8
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Lcom/android/billingclient/api/a0;

    iget-object p5, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    iget-object p6, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 9
    invoke-direct {p1, p5, p2, p4, p6}, Lcom/android/billingclient/api/a0;-><init>(Landroid/content/Context;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;)V

    iput-object p1, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    iput-object p3, p0, Lcom/android/billingclient/api/d;->x:Lcom/android/billingclient/api/s;

    if-eqz p4, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->y:Z

    return-void
.end method

.method static bridge synthetic l(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->l:Z

    return-void
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->m:Z

    return-void
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->n:Z

    return-void
.end method

.method static bridge synthetic o(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/b3;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    return-void
.end method

.method static bridge synthetic p(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->j:Z

    return-void
.end method

.method static bridge synthetic q(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->i:Z

    return-void
.end method

.method static synthetic x(Lcom/android/billingclient/api/d;Ljava/lang/String;I)Ln1/d0;
    .locals 17

    move-object/from16 v1, p0

    .line 1
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Querying owned items, item type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "BillingClient"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    .line 2
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v3, v1, Lcom/android/billingclient/api/d;->n:Z

    iget-boolean v4, v1, Lcom/android/billingclient/api/d;->v:Z

    iget-object v5, v1, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 3
    invoke-static {v3, v4, v6, v7, v5}, Lcom/google/android/gms/internal/play_billing/b0;->c(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    move-object v12, v4

    :goto_0
    const/16 v5, 0x9

    :try_start_0
    iget-boolean v8, v1, Lcom/android/billingclient/api/d;->n:Z

    if-eqz v8, :cond_1

    iget-object v8, v1, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-boolean v9, v1, Lcom/android/billingclient/api/d;->v:Z

    if-eq v6, v9, :cond_0

    const/16 v9, 0x9

    goto :goto_1

    :cond_0
    const/16 v9, 0x13

    :goto_1
    iget-object v10, v1, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 4
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    move-object v13, v3

    .line 5
    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/b3;->s0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v8

    move-object/from16 v11, p1

    goto :goto_2

    .line 6
    :cond_1
    iget-object v8, v1, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    const/4 v9, 0x3

    iget-object v10, v1, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 7
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    .line 8
    invoke-interface {v8, v9, v10, v11, v12}, Lcom/google/android/gms/internal/play_billing/b3;->p0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_2
    const-string v9, "getPurchase()"

    .line 9
    invoke-static {v8, v2, v9}, Lcom/android/billingclient/api/y;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/billingclient/api/x;->a()Lcom/android/billingclient/api/f;

    move-result-object v10

    .line 10
    sget-object v12, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    if-eq v10, v12, :cond_2

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    invoke-virtual {v9}, Lcom/android/billingclient/api/x;->b()I

    move-result v1

    .line 11
    invoke-static {v1, v5, v10}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Ln1/d0;

    invoke-direct {v0, v10, v4}, Ln1/d0;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto/16 :goto_4

    :cond_2
    const-string v9, "INAPP_PURCHASE_ITEM_LIST"

    .line 13
    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string v10, "INAPP_PURCHASE_DATA_LIST"

    .line 14
    invoke-virtual {v8, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    const-string v12, "INAPP_DATA_SIGNATURE_LIST"

    .line 15
    invoke-virtual {v8, v12}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 16
    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v13, v15, :cond_4

    .line 17
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 18
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Ljava/lang/String;

    .line 19
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "Sku is owned: "

    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v4, Lcom/android/billingclient/api/Purchase;

    .line 21
    invoke-direct {v4, v15, v6}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 22
    invoke-virtual {v4}, Lcom/android/billingclient/api/Purchase;->g()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "BUG: empty/null token!"

    .line 23
    invoke-static {v2, v6}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v14, 0x1

    .line 24
    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v3, "Got an exception trying to decode the purchase!"

    .line 25
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x33

    sget-object v2, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 26
    invoke-static {v1, v5, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Ln1/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Ln1/d0;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto :goto_4

    :cond_4
    if-eqz v14, :cond_5

    .line 28
    iget-object v4, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v6, 0x1a

    sget-object v7, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    .line 29
    invoke-static {v6, v5, v7}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v5

    .line 30
    invoke-interface {v4, v5}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    :cond_5
    const-string v4, "INAPP_CONTINUATION_TOKEN"

    .line 31
    invoke-virtual {v8, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Continuation token: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 32
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v1, Ln1/d0;

    sget-object v2, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    invoke-direct {v1, v2, v0}, Ln1/d0;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    move-object v0, v1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v0

    .line 34
    iget-object v1, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v3, 0x34

    .line 35
    sget-object v4, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 36
    invoke-static {v3, v5, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v3

    .line 37
    invoke-interface {v1, v3}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    const-string v1, "Got exception trying to get purchasesm try to reconnect"

    .line 38
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ln1/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v4, v1}, Ln1/d0;-><init>(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :goto_4
    return-object v0
.end method

.method private final y()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    return-object v0
.end method

.method private final z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/l0;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/l0;-><init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/f;)V

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method


# virtual methods
.method final synthetic I(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-object p4, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    .line 2
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/b3;->K(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method final synthetic J(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-object v1, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x3

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    .line 2
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/b3;->t0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method final synthetic P(Ln1/a;Ln1/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "BillingClient"

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-object v3, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {p1}, Ln1/a;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 3
    new-instance v5, Landroid/os/Bundle;

    .line 4
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "playBillingLibraryVersion"

    .line 5
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x9

    .line 6
    invoke-interface {v2, v4, v3, p1, v5}, Lcom/google/android/gms/internal/play_billing/b3;->A0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v2

    .line 8
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 9
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 10
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 11
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object p1

    .line 12
    invoke-interface {p2, p1}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-object v1

    :catch_0
    move-exception p1

    const-string v2, "Error acknowledge purchase!"

    .line 13
    invoke-static {v0, v2, p1}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v0, 0x1c

    const/4 v2, 0x3

    .line 14
    sget-object v3, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 15
    invoke-static {v0, v2, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 16
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 17
    invoke-interface {p2, v3}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-object v1
.end method

.method final synthetic Q(Ln1/e;Ln1/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "BillingClient"

    .line 1
    invoke-virtual {p1}, Ln1/e;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x4

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Consuming purchase with token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/android/billingclient/api/d;->n:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-object v3, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 3
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lcom/android/billingclient/api/d;->n:Z

    iget-object v5, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    new-instance v6, Landroid/os/Bundle;

    .line 4
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    if-eqz v4, :cond_0

    const-string v4, "playBillingLibraryVersion"

    .line 5
    invoke-virtual {v6, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/16 v4, 0x9

    .line 6
    invoke-interface {v2, v4, v3, p1, v6}, Lcom/google/android/gms/internal/play_billing/b3;->F(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "RESPONSE_CODE"

    .line 7
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 8
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 9
    :cond_1
    iget-object v2, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 10
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-interface {v2, v3, v4, p1}, Lcom/google/android/gms/internal/play_billing/b3;->C(ILjava/lang/String;Ljava/lang/String;)I

    move-result v3

    const-string v2, ""

    .line 12
    :goto_0
    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v4

    .line 13
    invoke-virtual {v4, v3}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 14
    invoke-virtual {v4, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 15
    invoke-virtual {v4}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v2

    if-nez v3, :cond_2

    const-string v3, "Successfully consumed purchase."

    .line 16
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-interface {p2, v2, p1}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 18
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error consuming purchase with token. Response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v4, 0x17

    .line 19
    invoke-static {v4, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v4

    .line 20
    invoke-interface {v3, v4}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 21
    invoke-interface {p2, v2, p1}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "Error consuming purchase!"

    .line 22
    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x1d

    .line 23
    sget-object v3, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 24
    invoke-static {v2, v1, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 26
    invoke-interface {p2, v3, p1}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V

    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method final synthetic R(Lcom/android/billingclient/api/h;Ln1/g;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "BillingClient"

    .line 1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/h;->c()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/android/billingclient/api/h;->b()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v10

    .line 4
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    const/4 v4, 0x0

    :goto_0
    const-string v13, "Error trying to decode SkuDetails."

    const-string v14, "Item is unavailable for purchase."

    const/4 v8, 0x0

    if-ge v4, v11, :cond_f

    add-int/lit8 v7, v4, 0x14

    if-le v7, v11, :cond_0

    move v5, v11

    goto :goto_1

    :cond_0
    move v5, v7

    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    .line 5
    invoke-interface {v10, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/ArrayList;

    .line 6
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v5, :cond_1

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 8
    check-cast v16, Lcom/android/billingclient/api/h$b;

    .line 9
    invoke-virtual/range {v16 .. v16}, Lcom/android/billingclient/api/h$b;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    new-instance v9, Landroid/os/Bundle;

    .line 10
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v5, "ITEM_ID_LIST"

    .line 11
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v4, v1, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    const-string v5, "playBillingLibraryVersion"

    .line 12
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v4, v1, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    iget-boolean v12, v1, Lcom/android/billingclient/api/d;->w:Z

    const/4 v15, 0x1

    if-eq v15, v12, :cond_2

    const/16 v12, 0x11

    goto :goto_3

    :cond_2
    const/16 v12, 0x14

    :goto_3
    iget-object v15, v1, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 13
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    move/from16 v18, v7

    iget-object v7, v1, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 14
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    if-eqz v19, :cond_3

    :try_start_1
    iget-object v8, v1, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 15
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    :cond_3
    new-instance v8, Landroid/os/Bundle;

    .line 17
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 18
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "enablePendingPurchases"

    const/4 v7, 0x1

    .line 19
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v5, "SKU_DETAILS_RESPONSE_FORMAT"

    const-string v7, "PRODUCT_DETAILS"

    .line 20
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    .line 21
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    .line 22
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v10

    .line 23
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    move/from16 v22, v11

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    :goto_4
    if-ge v11, v10, :cond_5

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v24

    .line 24
    check-cast v24, Lcom/android/billingclient/api/h$b;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v25, v6

    const/4 v6, 0x0

    .line 25
    :try_start_2
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v26
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v6, 0x1

    xor-int/lit8 v17, v26, 0x1

    or-int v23, v23, v17

    .line 27
    :try_start_3
    invoke-virtual/range {v24 .. v24}, Lcom/android/billingclient/api/h$b;->c()Ljava/lang/String;

    move-result-object v6

    move/from16 v24, v10

    const-string v10, "first_party"

    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products."
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    const/4 v10, 0x0

    .line 28
    :try_start_4
    invoke-static {v10, v6}, Lcom/google/android/gms/internal/play_billing/j5;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/16 v21, 0x1

    :cond_4
    add-int/lit8 v11, v11, 0x1

    move/from16 v10, v24

    move-object/from16 v6, v25

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v12, v6

    goto/16 :goto_8

    :cond_5
    if-eqz v23, :cond_6

    :try_start_5
    const-string v6, "SKU_OFFER_ID_TOKEN_LIST"

    .line 30
    invoke-virtual {v8, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    :cond_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_7

    const-string v5, "SKU_SERIALIZED_DOCID_LIST"

    .line 32
    invoke-virtual {v8, v5, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :cond_7
    if-eqz v21, :cond_8

    const/4 v10, 0x0

    .line 33
    :try_start_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, "accountName"

    .line 34
    invoke-virtual {v8, v5, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v12, v10

    goto/16 :goto_8

    :cond_8
    const/4 v10, 0x0

    :cond_9
    :goto_5
    move v5, v12

    move-object v6, v15

    move/from16 v11, v18

    move-object v7, v0

    move-object v12, v10

    move-object v10, v8

    move-object v8, v9

    const/4 v15, 0x6

    move-object v9, v10

    .line 35
    :try_start_7
    invoke-interface/range {v4 .. v9}, Lcom/google/android/gms/internal/play_billing/b3;->z(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    if-nez v4, :cond_a

    const-string v0, "queryProductDetailsAsync got empty product details response."

    .line 36
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x2c

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v4

    const/4 v5, 0x4

    .line 37
    invoke-virtual {v4, v5}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 38
    invoke-virtual {v4, v14}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 39
    invoke-virtual {v4}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v4

    const/4 v6, 0x7

    .line 40
    invoke-static {v2, v6, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 41
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    :goto_6
    move-object v13, v14

    const/4 v15, 0x4

    goto/16 :goto_a

    :cond_a
    const/4 v5, 0x4

    const-string v6, "DETAILS_LIST"

    .line 42
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_c

    .line 43
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/b0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    .line 44
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/b0;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v0, :cond_b

    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 46
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v4, 0x17

    .line 47
    invoke-static {v0, v13}, Lcom/android/billingclient/api/o;->a(ILjava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object v5

    const/4 v7, 0x7

    .line 48
    invoke-static {v4, v7, v5}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v4

    .line 49
    invoke-interface {v2, v4}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    move v15, v0

    goto/16 :goto_a

    :cond_b
    const/4 v7, 0x7

    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 50
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x2d

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v4

    .line 51
    invoke-virtual {v4, v15}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 52
    invoke-virtual {v4, v13}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 53
    invoke-virtual {v4}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v4

    .line 54
    invoke-static {v2, v7, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 55
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    goto/16 :goto_a

    :cond_c
    const/4 v7, 0x7

    .line 56
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_d

    const-string v0, "queryProductDetailsAsync got null response list"

    .line 57
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x2e

    .line 58
    sget-object v4, Lcom/android/billingclient/api/o;->B:Lcom/android/billingclient/api/f;

    .line 59
    invoke-static {v2, v7, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 60
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    goto :goto_6

    :cond_d
    const/4 v5, 0x0

    .line 61
    :goto_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_e

    .line 62
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    :try_start_8
    new-instance v7, Lcom/android/billingclient/api/g;

    .line 63
    invoke-direct {v7, v6}, Lcom/android/billingclient/api/g;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_2

    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v8, "Got product details: "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :catch_2
    move-exception v0

    const-string v4, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 66
    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x2f

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v4

    .line 67
    invoke-virtual {v4, v15}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 68
    invoke-virtual {v4, v13}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 69
    invoke-virtual {v4}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v4

    const/4 v5, 0x7

    .line 70
    invoke-static {v2, v5, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 71
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    goto :goto_a

    :cond_e
    move v4, v11

    move-object/from16 v10, v20

    move/from16 v11, v22

    goto/16 :goto_0

    :catch_3
    move-exception v0

    goto :goto_9

    :catch_4
    move-exception v0

    const/4 v12, 0x0

    goto :goto_8

    :catch_5
    move-exception v0

    move-object v12, v8

    :goto_8
    const/4 v15, 0x6

    :goto_9
    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 72
    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x2b

    .line 73
    sget-object v4, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    const/4 v5, 0x7

    .line 74
    invoke-static {v2, v5, v4}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 75
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    const-string v13, "An internal error occurred."

    goto :goto_a

    :cond_f
    move-object v12, v8

    const-string v13, ""

    const/4 v15, 0x0

    .line 76
    :goto_a
    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v15}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 78
    invoke-virtual {v0, v13}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 79
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    move-object/from16 v2, p2

    .line 80
    invoke-interface {v2, v0, v3}, Ln1/g;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-object v12
.end method

.method public final a(Ln1/a;Ln1/b;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v0, 0x2

    .line 2
    sget-object v2, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 4
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 5
    invoke-interface {p2, v2}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Ln1/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid purchase token."

    .line 7
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v0, 0x1a

    .line 8
    sget-object v2, Lcom/android/billingclient/api/o;->i:Lcom/android/billingclient/api/f;

    .line 9
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 11
    invoke-interface {p2, v2}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->n:Z

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v0, 0x1b

    .line 12
    sget-object v2, Lcom/android/billingclient/api/o;->b:Lcom/android/billingclient/api/f;

    .line 13
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 15
    invoke-interface {p2, v2}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-void

    :cond_2
    new-instance v4, Lcom/android/billingclient/api/g0;

    invoke-direct {v4, p0, p1, p2}, Lcom/android/billingclient/api/g0;-><init>(Lcom/android/billingclient/api/d;Ln1/a;Ln1/b;)V

    const-wide/16 v5, 0x7530

    new-instance v7, Lcom/android/billingclient/api/h0;

    invoke-direct {v7, p0, p2}, Lcom/android/billingclient/api/h0;-><init>(Lcom/android/billingclient/api/d;Ln1/b;)V

    .line 16
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object v8

    move-object v3, p0

    .line 17
    invoke-direct/range {v3 .. v8}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    .line 18
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object p1

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x19

    .line 19
    invoke-static {v2, v1, p1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 21
    invoke-interface {p2, p1}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    :cond_3
    return-void
.end method

.method public final b(Ln1/e;Ln1/f;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v2, 0x2

    .line 2
    sget-object v3, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v2, v1, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 5
    invoke-virtual {p1}, Ln1/e;->a()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-interface {p2, v3, p1}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v5, Lcom/android/billingclient/api/d0;

    invoke-direct {v5, p0, p1, p2}, Lcom/android/billingclient/api/d0;-><init>(Lcom/android/billingclient/api/d;Ln1/e;Ln1/f;)V

    const-wide/16 v6, 0x7530

    new-instance v8, Lcom/android/billingclient/api/e0;

    invoke-direct {v8, p0, p2, p1}, Lcom/android/billingclient/api/e0;-><init>(Lcom/android/billingclient/api/d;Ln1/f;Ln1/e;)V

    .line 7
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object v9

    move-object v4, p0

    .line 8
    invoke-direct/range {v4 .. v9}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-nez v0, :cond_1

    .line 9
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object v0

    iget-object v2, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v3, 0x19

    .line 10
    invoke-static {v3, v1, v0}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 11
    invoke-interface {v2, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 12
    invoke-virtual {p1}, Ln1/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/android/billingclient/api/f;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x5

    if-nez v0, :cond_1

    .line 2
    sget-object p1, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 3
    invoke-static {v1, v2, p1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 5
    invoke-static {v2}, Ln1/u;->b(I)Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->a(Lcom/google/android/gms/internal/play_billing/h4;)V

    :goto_0
    return-object p1

    .line 6
    :cond_1
    sget v0, Lcom/android/billingclient/api/o;->D:I

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0xb

    const/16 v4, 0x8

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x3

    const/4 v8, 0x4

    const/4 v9, 0x1

    const/16 v10, 0xa

    const/16 v11, 0x9

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "subscriptions"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "priceChangeConfirmation"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "iii"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0xb

    goto :goto_2

    :sswitch_3
    const-string v0, "hhh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0xa

    goto :goto_2

    :sswitch_4
    const-string v0, "ggg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x9

    goto :goto_2

    :sswitch_5
    const-string v0, "fff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    goto :goto_2

    :sswitch_6
    const-string v0, "eee"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x7

    goto :goto_2

    :sswitch_7
    const-string v0, "ddd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x5

    goto :goto_2

    :sswitch_8
    const-string v0, "ccc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x6

    goto :goto_2

    :sswitch_9
    const-string v0, "bbb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    goto :goto_2

    :sswitch_a
    const-string v0, "aaa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    goto :goto_2

    :sswitch_b
    const-string v0, "subscriptionsUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, -0x1

    :goto_2
    packed-switch v0, :pswitch_data_0

    const-string v0, "Unsupported feature: "

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "BillingClient"

    .line 9
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/o;->y:Lcom/android/billingclient/api/f;

    const/16 v0, 0x22

    .line 10
    invoke-direct {p0, p1, v0, v9}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    .line 11
    :pswitch_0
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->w:Z

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_3

    .line 12
    :cond_3
    sget-object p1, Lcom/android/billingclient/api/o;->C:Lcom/android/billingclient/api/f;

    :goto_3
    const/16 v0, 0x3c

    const/16 v1, 0xd

    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_1
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->u:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_4

    .line 13
    :cond_4
    sget-object p1, Lcom/android/billingclient/api/o;->A:Lcom/android/billingclient/api/f;

    :goto_4
    const/16 v0, 0x21

    const/16 v1, 0xc

    invoke-direct {p0, p1, v0, v1}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_2
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->u:Z

    if-eqz p1, :cond_5

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_5

    .line 14
    :cond_5
    sget-object p1, Lcom/android/billingclient/api/o;->z:Lcom/android/billingclient/api/f;

    :goto_5
    const/16 v0, 0x20

    invoke-direct {p0, p1, v0, v3}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_3
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->t:Z

    if-eqz p1, :cond_6

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_6

    .line 15
    :cond_6
    sget-object p1, Lcom/android/billingclient/api/o;->v:Lcom/android/billingclient/api/f;

    :goto_6
    const/16 v0, 0x14

    invoke-direct {p0, p1, v0, v10}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_4
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->s:Z

    if-eqz p1, :cond_7

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_7

    .line 16
    :cond_7
    sget-object p1, Lcom/android/billingclient/api/o;->t:Lcom/android/billingclient/api/f;

    :goto_7
    const/16 v0, 0x3d

    invoke-direct {p0, p1, v0, v11}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_5
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->s:Z

    if-eqz p1, :cond_8

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_8

    .line 17
    :cond_8
    sget-object p1, Lcom/android/billingclient/api/o;->t:Lcom/android/billingclient/api/f;

    :goto_8
    const/16 v0, 0x13

    invoke-direct {p0, p1, v0, v4}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_6
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->q:Z

    if-eqz p1, :cond_9

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_9

    .line 18
    :cond_9
    sget-object p1, Lcom/android/billingclient/api/o;->u:Lcom/android/billingclient/api/f;

    :goto_9
    const/16 v0, 0x15

    invoke-direct {p0, p1, v0, v5}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_7
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->r:Z

    if-eqz p1, :cond_a

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_a

    .line 19
    :cond_a
    sget-object p1, Lcom/android/billingclient/api/o;->s:Lcom/android/billingclient/api/f;

    :goto_a
    const/16 v0, 0x1f

    invoke-direct {p0, p1, v0, v6}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_8
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->p:Z

    if-eqz p1, :cond_b

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_b

    .line 20
    :cond_b
    sget-object p1, Lcom/android/billingclient/api/o;->w:Lcom/android/billingclient/api/f;

    :goto_b
    const/16 v0, 0x1e

    invoke-direct {p0, p1, v0, v2}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_9
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->m:Z

    if-eqz p1, :cond_c

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_c

    .line 21
    :cond_c
    sget-object p1, Lcom/android/billingclient/api/o;->r:Lcom/android/billingclient/api/f;

    :goto_c
    const/16 v0, 0x23

    invoke-direct {p0, p1, v0, v8}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    :pswitch_a
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->j:Z

    if-eqz p1, :cond_d

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_d

    .line 22
    :cond_d
    sget-object p1, Lcom/android/billingclient/api/o;->p:Lcom/android/billingclient/api/f;

    :goto_d
    invoke-direct {p0, p1, v10, v7}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    .line 23
    :pswitch_b
    iget-boolean p1, p0, Lcom/android/billingclient/api/d;->i:Z

    if-eqz p1, :cond_e

    sget-object p1, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    goto :goto_e

    .line 24
    :cond_e
    sget-object p1, Lcom/android/billingclient/api/o;->o:Lcom/android/billingclient/api/f;

    :goto_e
    invoke-direct {p0, p1, v11, v1}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/f;II)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1928a0a1 -> :sswitch_b
        0x17841 -> :sswitch_a
        0x17c22 -> :sswitch_9
        0x18003 -> :sswitch_8
        0x183e4 -> :sswitch_7
        0x187c5 -> :sswitch_6
        0x18ba6 -> :sswitch_5
        0x18f87 -> :sswitch_4
        0x19368 -> :sswitch_3
        0x19749 -> :sswitch_2
        0xc5ff92e -> :sswitch_1
        0x7674caf6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final d()Z
    .locals 2

    iget v0, p0, Lcom/android/billingclient/api/d;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->g:Lcom/google/android/gms/internal/play_billing/b3;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->h:Lcom/android/billingclient/api/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Landroid/app/Activity;Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/f;
    .locals 31

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "proxyPackageVersion"

    const-string v9, "BUY_INTENT"

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v2

    const/4 v10, 0x2

    if-nez v2, :cond_0

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 2
    sget-object v1, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v10, v10, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 4
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 5
    invoke-direct {v8, v1}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v1

    .line 6
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->h()Ljava/util/ArrayList;

    move-result-object v2

    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->i()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    .line 8
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/w5;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/SkuDetails;

    .line 9
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/w5;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/e$b;

    if-eqz v5, :cond_1

    .line 10
    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v7

    .line 11
    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v6}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v7

    invoke-virtual {v7}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v7

    .line 13
    invoke-virtual {v6}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v11

    invoke-virtual {v11}, Lcom/android/billingclient/api/g;->c()Ljava/lang/String;

    move-result-object v11

    :goto_0
    const-string v12, "subs"

    .line 14
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/16 v13, 0x9

    const-string v14, "BillingClient"

    if-eqz v12, :cond_3

    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->i:Z

    if-eqz v12, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "Current client doesn\'t support subscriptions."

    .line 15
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 16
    sget-object v1, Lcom/android/billingclient/api/o;->o:Lcom/android/billingclient/api/f;

    .line 17
    invoke-static {v13, v10, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 18
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 19
    invoke-direct {v8, v1}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v1

    .line 20
    :cond_3
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->r()Z

    move-result v12

    if-eqz v12, :cond_5

    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->l:Z

    if-eqz v12, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    .line 21
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x12

    .line 22
    sget-object v2, Lcom/android/billingclient/api/o;->h:Lcom/android/billingclient/api/f;

    .line 23
    invoke-static {v1, v10, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 25
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2

    .line 26
    :cond_5
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v15, 0x1

    if-le v12, v15, :cond_7

    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->s:Z

    if-eqz v12, :cond_6

    goto :goto_3

    :cond_6
    const-string v0, "Current client doesn\'t support multi-item purchases."

    .line 27
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x13

    .line 28
    sget-object v2, Lcom/android/billingclient/api/o;->t:Lcom/android/billingclient/api/f;

    .line 29
    invoke-static {v1, v10, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 31
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2

    .line 32
    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_9

    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->t:Z

    if-eqz v12, :cond_8

    goto :goto_4

    :cond_8
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    .line 33
    invoke-static {v14, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x14

    .line 34
    sget-object v2, Lcom/android/billingclient/api/o;->v:Lcom/android/billingclient/api/f;

    .line 35
    invoke-static {v1, v10, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 36
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 37
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2

    .line 38
    :cond_9
    :goto_4
    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->l:Z

    if-eqz v12, :cond_31

    iget-boolean v12, v8, Lcom/android/billingclient/api/d;->n:Z

    iget-boolean v13, v8, Lcom/android/billingclient/api/d;->y:Z

    iget-object v10, v8, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 39
    new-instance v4, Landroid/os/Bundle;

    .line 40
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v15, "playBillingLibraryVersion"

    .line 41
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->c()I

    move-result v10

    const-string v15, "prorationMode"

    if-eqz v10, :cond_a

    .line 43
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->c()I

    move-result v10

    .line 44
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_5

    .line 45
    :cond_a
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->b()I

    move-result v10

    if-eqz v10, :cond_b

    .line 46
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->b()I

    move-result v10

    .line 47
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 48
    :cond_b
    :goto_5
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->d()Ljava/lang/String;

    move-result-object v10

    const-string v15, "accountId"

    .line 50
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :cond_c
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 52
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->e()Ljava/lang/String;

    move-result-object v10

    const-string v15, "obfuscatedProfileId"

    .line 53
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->q()Z

    move-result v10

    if-eqz v10, :cond_e

    const-string v10, "isOfferPersonalizedByDeveloper"

    const/4 v15, 0x1

    .line 55
    invoke-virtual {v4, v10, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_e
    const/4 v10, 0x0

    .line 56
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_f

    new-instance v15, Ljava/util/ArrayList;

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v17

    .line 57
    invoke-static/range {v17 .. v17}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v10, "skusToReplace"

    .line 58
    invoke-virtual {v4, v10, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 59
    :cond_f
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->f()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_10

    .line 60
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->f()Ljava/lang/String;

    move-result-object v10

    const-string v15, "oldSkuPurchaseToken"

    .line 61
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    const/4 v10, 0x0

    .line 62
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_11

    const-string v15, "oldSkuPurchaseId"

    .line 63
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_11
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_12

    .line 65
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/e;->g()Ljava/lang/String;

    move-result-object v15

    const-string v10, "originalExternalTransactionId"

    .line 66
    invoke-virtual {v4, v10, v15}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    .line 67
    :cond_12
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_13

    const-string v15, "paymentsPurchaseParams"

    .line 68
    invoke-virtual {v4, v15, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    if-eqz v12, :cond_14

    const-string v10, "enablePendingPurchases"

    const/4 v12, 0x1

    .line 69
    invoke-virtual {v4, v10, v12}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_6

    :cond_14
    const/4 v12, 0x1

    :goto_6
    if-eqz v13, :cond_15

    const-string v10, "enableAlternativeBilling"

    .line 70
    invoke-virtual {v4, v10, v12}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 71
    :cond_15
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    const-string v12, "additionalSkuTypes"

    const-string v13, "additionalSkus"

    const-string v15, "SKU_SERIALIZED_DOCID_LIST"

    move-object/from16 v17, v9

    const-string v9, "skuDetailsTokens"

    const-string v0, "SKU_OFFER_ID_TOKEN_LIST"

    move-object/from16 v18, v11

    if-nez v10, :cond_1f

    new-instance v10, Ljava/util/ArrayList;

    .line 72
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    .line 73
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v7

    new-instance v7, Ljava/util/ArrayList;

    .line 74
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v1

    new-instance v1, Ljava/util/ArrayList;

    .line 75
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v21, v14

    new-instance v14, Ljava/util/ArrayList;

    .line 76
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 77
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    :goto_7
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_18

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Lcom/android/billingclient/api/SkuDetails;

    .line 78
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->isEmpty()Z

    move-result v28

    if-nez v28, :cond_16

    move-object/from16 v28, v6

    .line 79
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_16
    move-object/from16 v28, v6

    .line 80
    :goto_8
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->e()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v29, v5

    .line 81
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v5

    .line 82
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->c()I

    move-result v30

    .line 83
    invoke-virtual/range {v27 .. v27}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    move-result-object v8

    .line 84
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/16 v16, 0x1

    xor-int/lit8 v6, v6, 0x1

    or-int v23, v23, v6

    .line 86
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    or-int v24, v24, v5

    .line 88
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v30, :cond_17

    const/4 v5, 0x1

    goto :goto_9

    :cond_17
    const/4 v5, 0x0

    :goto_9
    or-int v25, v25, v5

    .line 89
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    or-int v26, v26, v5

    .line 90
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p0

    move-object/from16 v6, v28

    move-object/from16 v5, v29

    goto :goto_7

    :cond_18
    move-object/from16 v29, v5

    move-object/from16 v28, v6

    .line 91
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_19

    .line 92
    invoke-virtual {v4, v9, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_19
    if-eqz v23, :cond_1a

    .line 93
    invoke-virtual {v4, v0, v11}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1a
    if-eqz v24, :cond_1b

    const-string v5, "SKU_OFFER_ID_LIST"

    .line 94
    invoke-virtual {v4, v5, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1b
    if-eqz v25, :cond_1c

    const-string v5, "SKU_OFFER_TYPE_LIST"

    .line 95
    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1c
    if-eqz v26, :cond_1d

    .line 96
    invoke-virtual {v4, v15, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 97
    :cond_1d
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v5, 0x1

    if-le v1, v5, :cond_26

    new-instance v1, Ljava/util/ArrayList;

    .line 98
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Ljava/util/ArrayList;

    .line 99
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v15, 0x1

    .line 100
    :goto_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    if-ge v15, v7, :cond_1e

    .line 101
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v7}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v7}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    goto :goto_a

    .line 103
    :cond_1e
    invoke-virtual {v4, v13, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 104
    invoke-virtual {v4, v12, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_c

    :cond_1f
    move-object/from16 v20, v1

    move-object/from16 v29, v5

    move-object/from16 v28, v6

    move-object/from16 v19, v7

    move-object/from16 v21, v14

    const/4 v5, 0x1

    .line 105
    new-instance v1, Ljava/util/ArrayList;

    .line 106
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    .line 107
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Ljava/util/ArrayList;

    .line 108
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    .line 109
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    .line 110
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    .line 111
    :goto_b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_23

    .line 112
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/android/billingclient/api/e$b;

    .line 113
    invoke-virtual {v11}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v14

    .line 114
    invoke-virtual {v14}, Lcom/android/billingclient/api/g;->f()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_20

    .line 115
    invoke-virtual {v14}, Lcom/android/billingclient/api/g;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_20
    invoke-virtual {v11}, Lcom/android/billingclient/api/e$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    invoke-virtual {v14}, Lcom/android/billingclient/api/g;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_21

    .line 118
    invoke-virtual {v14}, Lcom/android/billingclient/api/g;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    if-lez v10, :cond_22

    .line 119
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/e$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v5

    invoke-virtual {v5}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v5

    .line 120
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/e$b;

    invoke-virtual {v5}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v5

    invoke-virtual {v5}, Lcom/android/billingclient/api/g;->c()Ljava/lang/String;

    move-result-object v5

    .line 122
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    add-int/lit8 v10, v10, 0x1

    const/4 v5, 0x1

    goto :goto_b

    .line 123
    :cond_23
    invoke-virtual {v4, v0, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 124
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_24

    .line 125
    invoke-virtual {v4, v9, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 126
    :cond_24
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    .line 127
    invoke-virtual {v4, v15, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 128
    :cond_25
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_26

    .line 129
    invoke-virtual {v4, v13, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 130
    invoke-virtual {v4, v12, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 131
    :cond_26
    :goto_c
    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v8, p0

    if-eqz v0, :cond_28

    iget-boolean v0, v8, Lcom/android/billingclient/api/d;->q:Z

    if-eqz v0, :cond_27

    goto :goto_d

    .line 132
    :cond_27
    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v1, 0x15

    .line 133
    sget-object v2, Lcom/android/billingclient/api/o;->u:Lcom/android/billingclient/api/f;

    const/4 v3, 0x2

    .line 134
    invoke-static {v1, v3, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 135
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 136
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2

    :cond_28
    :goto_d
    const-string v0, "skuPackageName"

    if-eqz v29, :cond_29

    .line 137
    invoke-virtual/range {v29 .. v29}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_29

    .line 138
    invoke-virtual/range {v29 .. v29}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_e
    const/4 v0, 0x0

    const/4 v15, 0x1

    goto :goto_f

    :cond_29
    if-eqz v28, :cond_2a

    .line 140
    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v1

    .line 141
    invoke-virtual {v1}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/e$b;->b()Lcom/android/billingclient/api/g;

    move-result-object v1

    .line 142
    invoke-virtual {v1}, Lcom/android/billingclient/api/g;->e()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_2a
    const/4 v0, 0x0

    const/4 v15, 0x0

    .line 144
    :goto_f
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2b

    const-string v1, "accountName"

    .line 145
    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    :cond_2b
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_2c

    const-string v0, "Activity\'s intent is null."

    move-object/from16 v9, v21

    .line 147
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    :cond_2c
    move-object/from16 v9, v21

    const-string v1, "PROXY_PACKAGE"

    .line 148
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2d

    .line 149
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "proxyPackage"

    .line 150
    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v8, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 151
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    .line 152
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, v20

    .line 153
    :try_start_1
    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_10

    :catch_0
    move-object/from16 v1, v20

    :catch_1
    const-string v0, "package not found"

    .line 154
    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    :cond_2d
    :goto_10
    iget-boolean v0, v8, Lcom/android/billingclient/api/d;->t:Z

    if-eqz v0, :cond_2e

    .line 156
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2e

    const/16 v0, 0x11

    const/16 v3, 0x11

    goto :goto_11

    .line 157
    :cond_2e
    iget-boolean v0, v8, Lcom/android/billingclient/api/d;->r:Z

    if-eqz v0, :cond_2f

    if-eqz v15, :cond_2f

    const/16 v0, 0xf

    const/16 v3, 0xf

    goto :goto_11

    :cond_2f
    iget-boolean v0, v8, Lcom/android/billingclient/api/d;->n:Z

    if-eqz v0, :cond_30

    const/16 v3, 0x9

    goto :goto_11

    :cond_30
    const/4 v0, 0x6

    const/4 v3, 0x6

    .line 158
    :goto_11
    new-instance v0, Lcom/android/billingclient/api/i0;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object v7, v4

    move-object/from16 v4, v19

    move-object/from16 v5, v18

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/i0;-><init>(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/os/Bundle;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    move-object v2, v0

    .line 159
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_12

    :cond_31
    move-object/from16 v19, v7

    move-object/from16 v17, v9

    move-object/from16 v18, v11

    move-object v9, v14

    .line 160
    new-instance v2, Lcom/android/billingclient/api/j0;

    invoke-direct {v2, v8, v7, v11}, Lcom/android/billingclient/api/j0;-><init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/android/billingclient/api/d;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    .line 161
    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    :goto_12
    const-wide/16 v1, 0x1388

    .line 162
    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 163
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 164
    invoke-static {v0, v9}, Lcom/google/android/gms/internal/play_billing/b0;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v1

    .line 165
    invoke-static {v0, v9}, Lcom/google/android/gms/internal/play_billing/b0;->e(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_32

    new-instance v0, Ljava/lang/StringBuilder;

    .line 166
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to buy item, Error response code: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 167
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 168
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 169
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    iget-object v1, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v2, 0x3

    const/4 v3, 0x2

    .line 170
    invoke-static {v2, v3, v0}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 171
    invoke-interface {v1, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 172
    invoke-direct {v8, v0}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v0

    :cond_32
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/android/billingclient/api/ProxyBillingActivity;

    move-object/from16 v3, p1

    .line 173
    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v2, v17

    .line 174
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    .line 175
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 176
    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 177
    sget-object v0, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    return-object v0

    :catch_2
    move-exception v0

    const-string v1, "Exception while launching billing flow. Try to reconnect"

    .line 178
    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v1, 0x5

    .line 179
    sget-object v2, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    const/4 v3, 0x2

    .line 180
    invoke-static {v1, v3, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 181
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 182
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2

    :catch_3
    move-exception v0

    goto :goto_13

    :catch_4
    move-exception v0

    :goto_13
    const-string v1, "Time out while launching billing flow. Try to reconnect"

    .line 183
    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v8, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v1, 0x4

    .line 184
    sget-object v2, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/4 v3, 0x2

    .line 185
    invoke-static {v1, v3, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 186
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 187
    invoke-direct {v8, v2}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/f;

    return-object v2
.end method

.method public final g(Lcom/android/billingclient/api/h;Ln1/g;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x7

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/4 v0, 0x2

    .line 2
    sget-object v2, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 3
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 4
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance p1, Ljava/util/ArrayList;

    .line 5
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v2, p1}, Ln1/g;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->t:Z

    if-nez v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Querying product details is not supported."

    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v0, 0x14

    .line 7
    sget-object v2, Lcom/android/billingclient/api/o;->v:Lcom/android/billingclient/api/f;

    .line 8
    invoke-static {v0, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance p1, Ljava/util/ArrayList;

    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v2, p1}, Ln1/g;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_1
    new-instance v4, Lcom/android/billingclient/api/b0;

    invoke-direct {v4, p0, p1, p2}, Lcom/android/billingclient/api/b0;-><init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/h;Ln1/g;)V

    const-wide/16 v5, 0x7530

    new-instance v7, Lcom/android/billingclient/api/c0;

    invoke-direct {v7, p0, p2}, Lcom/android/billingclient/api/c0;-><init>(Lcom/android/billingclient/api/d;Ln1/g;)V

    .line 11
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->y()Landroid/os/Handler;

    move-result-object v8

    move-object v3, p0

    .line 12
    invoke-direct/range {v3 .. v8}, Lcom/android/billingclient/api/d;->C(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    .line 13
    invoke-direct {p0}, Lcom/android/billingclient/api/d;->A()Lcom/android/billingclient/api/f;

    move-result-object p1

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x19

    .line 14
    invoke-static {v2, v1, p1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Ljava/util/ArrayList;

    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p1, v0}, Ln1/g;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public final h(Ln1/k;Ln1/h;)V
    .locals 0

    invoke-virtual {p1}, Ln1/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/d;->D(Ljava/lang/String;Ln1/h;)V

    return-void
.end method

.method public final i(Ln1/l;Ln1/i;)V
    .locals 0

    invoke-virtual {p1}, Ln1/l;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/d;->E(Ljava/lang/String;Ln1/i;)V

    return-void
.end method

.method public final j(Ln1/d;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/d;->d()Z

    move-result v0

    const/4 v1, 0x6

    const-string v2, "BillingClient"

    if-eqz v0, :cond_0

    const-string v0, "Service connection is valid. No need to re-initialize."

    .line 2
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 3
    invoke-static {v1}, Ln1/u;->b(I)Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->a(Lcom/google/android/gms/internal/play_billing/h4;)V

    .line 4
    sget-object v0, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    invoke-interface {p1, v0}, Ln1/d;->a(Lcom/android/billingclient/api/f;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/android/billingclient/api/d;->a:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    const-string v0, "Client is already in the process of connecting to billing service."

    .line 5
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x25

    .line 6
    sget-object v3, Lcom/android/billingclient/api/o;->d:Lcom/android/billingclient/api/f;

    .line 7
    invoke-static {v2, v1, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 8
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 9
    invoke-interface {p1, v3}, Ln1/d;->a(Lcom/android/billingclient/api/f;)V

    return-void

    :cond_1
    iget v0, p0, Lcom/android/billingclient/api/d;->a:I

    const/4 v4, 0x3

    if-ne v0, v4, :cond_2

    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    .line 10
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    const/16 v2, 0x26

    .line 11
    sget-object v3, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    .line 12
    invoke-static {v2, v1, v3}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 14
    invoke-interface {p1, v3}, Ln1/d;->a(Lcom/android/billingclient/api/f;)V

    return-void

    :cond_2
    iput v3, p0, Lcom/android/billingclient/api/d;->a:I

    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    .line 15
    invoke-virtual {v0}, Lcom/android/billingclient/api/a0;->d()V

    const-string v0, "Starting in-app billing setup."

    .line 16
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/l;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcom/android/billingclient/api/l;-><init>(Lcom/android/billingclient/api/d;Ln1/d;Ln1/n;)V

    iput-object v0, p0, Lcom/android/billingclient/api/d;->h:Lcom/android/billingclient/api/l;

    new-instance v0, Landroid/content/Intent;

    const-string v4, "com.android.vending.billing.InAppBillingService.BIND"

    .line 17
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "com.android.vending"

    .line 18
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v5, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    .line 19
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x29

    if-eqz v5, :cond_5

    .line 20
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_5

    .line 21
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 22
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v5, :cond_6

    .line 23
    iget-object v7, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 24
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 25
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    new-instance v4, Landroid/content/ComponentName;

    .line 26
    invoke-direct {v4, v7, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Landroid/content/Intent;

    .line 27
    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 28
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    const-string v4, "playBillingLibraryVersion"

    .line 29
    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Landroid/content/Context;

    iget-object v4, p0, Lcom/android/billingclient/api/d;->h:Lcom/android/billingclient/api/l;

    .line 30
    invoke-virtual {v0, v5, v4, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Service was bonded successfully."

    .line 31
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    .line 32
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x27

    goto :goto_0

    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    .line 33
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x28

    goto :goto_0

    :cond_5
    const/16 v3, 0x29

    .line 34
    :cond_6
    :goto_0
    iput v6, p0, Lcom/android/billingclient/api/d;->a:I

    const-string v0, "Billing service unavailable on device."

    .line 35
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    .line 36
    sget-object v2, Lcom/android/billingclient/api/o;->c:Lcom/android/billingclient/api/f;

    .line 37
    invoke-static {v3, v1, v2}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v1

    .line 38
    invoke-interface {v0, v1}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 39
    invoke-interface {p1, v2}, Ln1/d;->a(Lcom/android/billingclient/api/f;)V

    return-void
.end method

.method final synthetic r(Ln1/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    sget-object v1, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/16 v2, 0x18

    const/4 v3, 0x3

    .line 2
    invoke-static {v2, v3, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 3
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 4
    invoke-interface {p1, v1}, Ln1/b;->a(Lcom/android/billingclient/api/f;)V

    return-void
.end method

.method final synthetic s(Lcom/android/billingclient/api/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    invoke-virtual {v0}, Lcom/android/billingclient/api/a0;->c()Ln1/j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    .line 2
    invoke-virtual {v0}, Lcom/android/billingclient/api/a0;->c()Ln1/j;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, p1, v1}, Ln1/j;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a0;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/a0;->b()Ln1/z;

    const-string p1, "BillingClient"

    const-string v0, "No valid listener is set in BroadcastManager"

    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic t(Ln1/f;Ln1/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    sget-object v1, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/16 v2, 0x18

    const/4 v3, 0x4

    .line 2
    invoke-static {v2, v3, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 3
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 4
    invoke-virtual {p2}, Ln1/e;->a()Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-interface {p1, v1, p2}, Ln1/f;->a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic u(Ln1/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    sget-object v1, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/16 v2, 0x18

    const/4 v3, 0x7

    .line 2
    invoke-static {v2, v3, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 3
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    new-instance v0, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v1, v0}, Ln1/g;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void
.end method

.method final synthetic v(Ln1/h;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    sget-object v1, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/16 v2, 0x18

    const/16 v3, 0xb

    .line 2
    invoke-static {v2, v3, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 3
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v1, v0}, Ln1/h;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void
.end method

.method final synthetic w(Ln1/i;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->f:Lcom/android/billingclient/api/n;

    sget-object v1, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    const/16 v2, 0x18

    const/16 v3, 0x9

    .line 2
    invoke-static {v2, v3, v1}, Ln1/u;->a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;

    move-result-object v2

    .line 3
    invoke-interface {v0, v2}, Lcom/android/billingclient/api/n;->c(Lcom/google/android/gms/internal/play_billing/d4;)V

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v0

    .line 5
    invoke-interface {p1, v1, v0}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    return-void
.end method
