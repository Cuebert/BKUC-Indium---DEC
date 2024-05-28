.class Ly/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/h;->e(Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ly/h;


# direct methods
.method constructor <init>(Ly/h;)V
    .locals 0

    iput-object p1, p0, Ly/h$b;->n:Ly/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly/h$b;->n:Ly/h;

    const/4 v1, 0x0

    iput-object v1, v0, Ly/h;->o:Ljava/util/List;

    .line 2
    iput-object v1, v0, Ly/h;->n:Ljava/util/List;

    return-void
.end method
