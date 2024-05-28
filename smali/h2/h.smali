.class public final synthetic Lh2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lh2/r;

.field public final synthetic o:La2/o;

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lh2/r;La2/o;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/h;->n:Lh2/r;

    iput-object p2, p0, Lh2/h;->o:La2/o;

    iput p3, p0, Lh2/h;->p:I

    iput-object p4, p0, Lh2/h;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lh2/h;->n:Lh2/r;

    iget-object v1, p0, Lh2/h;->o:La2/o;

    iget v2, p0, Lh2/h;->p:I

    iget-object v3, p0, Lh2/h;->q:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lh2/r;->a(Lh2/r;La2/o;ILjava/lang/Runnable;)V

    return-void
.end method
