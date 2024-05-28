.class public final synthetic Lec/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lec/j;


# direct methods
.method public synthetic constructor <init>(Lec/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec/h;->n:Lec/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lec/h;->n:Lec/j;

    invoke-virtual {v0}, Lec/j;->H()V

    return-void
.end method
