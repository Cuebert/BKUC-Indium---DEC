.class Lf7/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/n;->g0(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lf7/n;


# direct methods
.method constructor <init>(Lf7/n;)V
    .locals 0

    iput-object p1, p0, Lf7/n$a;->n:Lf7/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lf7/n$a;->n:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->U()V

    return-void
.end method
