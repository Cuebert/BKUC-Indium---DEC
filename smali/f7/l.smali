.class public final synthetic Lf7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lf7/n;


# direct methods
.method public synthetic constructor <init>(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/l;->n:Lf7/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf7/l;->n:Lf7/n;

    invoke-static {v0}, Lf7/n;->r(Lf7/n;)V

    return-void
.end method
