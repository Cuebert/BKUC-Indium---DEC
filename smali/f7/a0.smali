.class public final synthetic Lf7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lf7/b0;

.field public final synthetic o:Landroid/app/Activity;

.field public final synthetic p:Lf7/z;


# direct methods
.method public synthetic constructor <init>(Lf7/b0;Landroid/app/Activity;Lf7/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/a0;->n:Lf7/b0;

    iput-object p2, p0, Lf7/a0;->o:Landroid/app/Activity;

    iput-object p3, p0, Lf7/a0;->p:Lf7/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf7/a0;->n:Lf7/b0;

    iget-object v1, p0, Lf7/a0;->o:Landroid/app/Activity;

    iget-object v2, p0, Lf7/a0;->p:Lf7/z;

    invoke-static {v0, v1, v2}, Lf7/b0;->a(Lf7/b0;Landroid/app/Activity;Lf7/z;)V

    return-void
.end method
