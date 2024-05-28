.class public final synthetic Lcom/google/common/util/concurrent/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/common/util/concurrent/e;

.field public final synthetic o:Lcom/google/common/util/concurrent/m;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/e;Lcom/google/common/util/concurrent/m;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/common/util/concurrent/c;->n:Lcom/google/common/util/concurrent/e;

    iput-object p2, p0, Lcom/google/common/util/concurrent/c;->o:Lcom/google/common/util/concurrent/m;

    iput p3, p0, Lcom/google/common/util/concurrent/c;->p:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/common/util/concurrent/c;->n:Lcom/google/common/util/concurrent/e;

    iget-object v1, p0, Lcom/google/common/util/concurrent/c;->o:Lcom/google/common/util/concurrent/m;

    iget v2, p0, Lcom/google/common/util/concurrent/c;->p:I

    invoke-static {v0, v1, v2}, Lcom/google/common/util/concurrent/e;->L(Lcom/google/common/util/concurrent/e;Lcom/google/common/util/concurrent/m;I)V

    return-void
.end method
