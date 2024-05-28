.class public Lx2/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ly2/m;

.field private b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx2/e$a;
    .locals 4

    .line 1
    iget-object v0, p0, Lx2/e$a$a;->a:Ly2/m;

    if-nez v0, :cond_0

    new-instance v0, Ly2/a;

    invoke-direct {v0}, Ly2/a;-><init>()V

    iput-object v0, p0, Lx2/e$a$a;->a:Ly2/m;

    :cond_0
    iget-object v0, p0, Lx2/e$a$a;->b:Landroid/os/Looper;

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lx2/e$a$a;->b:Landroid/os/Looper;

    .line 3
    :cond_1
    new-instance v0, Lx2/e$a;

    iget-object v1, p0, Lx2/e$a$a;->a:Ly2/m;

    iget-object v2, p0, Lx2/e$a$a;->b:Landroid/os/Looper;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lx2/e$a;-><init>(Ly2/m;Landroid/accounts/Account;Landroid/os/Looper;Lx2/q;)V

    return-object v0
.end method

.method public b(Landroid/os/Looper;)Lx2/e$a$a;
    .locals 1

    const-string v0, "Looper must not be null."

    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx2/e$a$a;->b:Landroid/os/Looper;

    return-object p0
.end method

.method public c(Ly2/m;)Lx2/e$a$a;
    .locals 1

    const-string v0, "StatusExceptionMapper must not be null."

    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx2/e$a$a;->a:Ly2/m;

    return-object p0
.end method
