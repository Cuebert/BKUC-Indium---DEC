.class public interface abstract Lva/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lva/d$b;,
        Lva/d$a;
    }
.end annotation


# static fields
.field public static final l:Lva/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lva/d$b;->n:Lva/d$b;

    sput-object v0, Lva/d;->l:Lva/d$b;

    return-void
.end method


# virtual methods
.method public abstract Q(Lva/c;)Lva/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lva/c<",
            "-TT;>;)",
            "Lva/c<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract W(Lva/c;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "*>;)V"
        }
    .end annotation
.end method
