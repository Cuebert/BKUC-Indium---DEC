.class public final synthetic Lw/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/common/util/concurrent/m;

.field public final synthetic o:Landroidx/concurrent/futures/c$a;

.field public final synthetic p:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/u0;->n:Lcom/google/common/util/concurrent/m;

    iput-object p2, p0, Lw/u0;->o:Landroidx/concurrent/futures/c$a;

    iput-wide p3, p0, Lw/u0;->p:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lw/u0;->n:Lcom/google/common/util/concurrent/m;

    iget-object v1, p0, Lw/u0;->o:Landroidx/concurrent/futures/c$a;

    iget-wide v2, p0, Lw/u0;->p:J

    invoke-static {v0, v1, v2, v3}, Lw/w0;->b(Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
