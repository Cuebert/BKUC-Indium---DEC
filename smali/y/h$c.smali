.class Ly/h$c;
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
.field final synthetic n:I

.field final synthetic o:Lcom/google/common/util/concurrent/m;

.field final synthetic p:Ly/h;


# direct methods
.method constructor <init>(Ly/h;ILcom/google/common/util/concurrent/m;)V
    .locals 0

    iput-object p1, p0, Ly/h$c;->p:Ly/h;

    iput p2, p0, Ly/h$c;->n:I

    iput-object p3, p0, Ly/h$c;->o:Lcom/google/common/util/concurrent/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ly/h$c;->p:Ly/h;

    iget v1, p0, Ly/h$c;->n:I

    iget-object v2, p0, Ly/h$c;->o:Lcom/google/common/util/concurrent/m;

    invoke-virtual {v0, v1, v2}, Ly/h;->f(ILjava/util/concurrent/Future;)V

    return-void
.end method
