.class final Lg4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# instance fields
.field final synthetic a:Lg4/i;


# direct methods
.method constructor <init>(Lg4/t;Lg4/i;)V
    .locals 0

    iput-object p2, p0, Lg4/p;->a:Lg4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lg4/p;->a:Lg4/i;

    .line 2
    invoke-interface {p1}, Lg4/i;->a()V

    return-void
.end method
