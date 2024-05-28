.class public final synthetic Lv/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv/g;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Lv/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/f;->n:Lv/g;

    iput-boolean p2, p0, Lv/f;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv/f;->n:Lv/g;

    iget-boolean v1, p0, Lv/f;->o:Z

    invoke-static {v0, v1}, Lv/g;->e(Lv/g;Z)V

    return-void
.end method
