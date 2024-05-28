.class Lw6/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lw6/b;


# direct methods
.method constructor <init>(Lw6/b;)V
    .locals 0

    iput-object p1, p0, Lw6/b$b;->n:Lw6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lw6/b$b;->n:Lw6/b;

    invoke-virtual {v0}, Lw6/b;->c()V

    return-void
.end method
