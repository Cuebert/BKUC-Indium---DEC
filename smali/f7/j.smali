.class public final synthetic Lf7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# instance fields
.field public final synthetic a:Lf7/n;


# direct methods
.method public synthetic constructor <init>(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/j;->a:Lf7/n;

    return-void
.end method


# virtual methods
.method public final onSystemUiVisibilityChange(I)V
    .locals 1

    iget-object v0, p0, Lf7/j;->a:Lf7/n;

    invoke-static {v0, p1}, Lf7/n;->n(Lf7/n;I)V

    return-void
.end method
