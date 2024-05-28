.class public Lz6/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/a$b;,
        Lz6/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;",
        "Lcom/roblox/client/components/k;"
    }
.end annotation


# static fields
.field public static b:Lcom/roblox/client/components/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roblox/client/components/k$a<",
            "Lz6/a$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lz6/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/a$b;

    invoke-direct {v0}, Lz6/a$b;-><init>()V

    sput-object v0, Lz6/a;->b:Lcom/roblox/client/components/k$a;

    return-void
.end method

.method public constructor <init>(Lz6/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    iput-object p1, p0, Lz6/a;->a:Lz6/a$a;

    return-void
.end method

.method public static b(Lz6/a$a;)Lcom/roblox/client/components/k;
    .locals 1

    sget-object v0, Lz6/a;->b:Lcom/roblox/client/components/k$a;

    invoke-interface {v0, p0}, Lcom/roblox/client/components/k$a;->a(Ljava/lang/Object;)Lcom/roblox/client/components/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected varargs c([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object p1

    invoke-virtual {p1}, Lf9/g;->l()Z

    const-string p1, "rbx.xapkmanager"

    const-string v0, "Unpacking complete"

    .line 2
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method protected d(Ljava/lang/Void;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz6/a;->a:Lz6/a$a;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Lz6/a$a;->a(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lz6/a;->c([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lz6/a;->d(Ljava/lang/Void;)V

    return-void
.end method
