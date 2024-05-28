.class public final synthetic Le7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Le7/e;

.field public final synthetic o:Landroidx/fragment/app/d;


# direct methods
.method public synthetic constructor <init>(Le7/e;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/d;->n:Le7/e;

    iput-object p2, p0, Le7/d;->o:Landroidx/fragment/app/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le7/d;->n:Le7/e;

    iget-object v1, p0, Le7/d;->o:Landroidx/fragment/app/d;

    invoke-static {v0, v1}, Le7/e;->k3(Le7/e;Landroidx/fragment/app/d;)V

    return-void
.end method
