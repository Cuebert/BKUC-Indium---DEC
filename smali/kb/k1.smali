.class public final Lkb/k1;
.super Lkb/v;
.source "SourceFile"


# static fields
.field public static final p:Lkb/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/k1;

    invoke-direct {v0}, Lkb/k1;-><init>()V

    sput-object v0, Lkb/k1;->p:Lkb/k1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/v;-><init>()V

    return-void
.end method


# virtual methods
.method public j0(Lva/e;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p2, Lkb/n1;->p:Lkb/n1$a;

    invoke-interface {p1, p2}, Lva/e;->i(Lva/e$b;)Lva/e$a;

    move-result-object p1

    check-cast p1, Lkb/n1;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p1, Lkb/n1;->o:Z

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k0(Lva/e;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
